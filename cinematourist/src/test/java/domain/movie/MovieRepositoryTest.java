package domain.movie;

import com.cinematourist.CinematouristApplication;
import com.cinematourist.domain.movie.Movie;
import com.cinematourist.domain.movie.MovieRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CinematouristApplication.class)
@WebAppConfiguration
public class MovieRepositoryTest {

    @Autowired
    private MovieRepository movieRepository;

    @Test
    public void should_save_movie() {
        // GIVEN
        Movie entity = Movie.builder()
                .title("A Clockwork Orange")
                .year(1978)
                .genre("")
                .country("USA")
                .director("Stanley Kubrick")
                .writer("")
                .cast("Malcolm McDowll")
                .awards("")
                .plot("A man walks into a bar")
                .build();

        // WHEN
        Movie savedEntity = movieRepository.save(entity);

        // THEN
        Assertions.assertThat(savedEntity).isEqualTo(entity);
    }
}
