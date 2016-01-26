import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;

/**
 * Created by LynAs on 26-Jan-16.
 */
public class TestGitHubAPI {

    @Test
    public void testUser() throws IOException {
        final String url = "https://api.github.com/users/lynas";
        URL url1 = new URL(url);
        ObjectMapper mapper = new ObjectMapper();
        GitUser gitUser = mapper.readValue(url1, GitUser.class);
        //System.out.println(gitUser.toString());

        Assert.assertEquals(gitUser.getId(),1265899);
        Assert.assertEquals(gitUser.getFollowers(),9);

    }
}
