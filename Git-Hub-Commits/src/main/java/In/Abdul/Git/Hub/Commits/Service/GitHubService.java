package In.Abdul.Git.Hub.Commits.Service;


import In.Abdul.Git.Hub.Commits.Entity.GitHubCommit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GitHubService {
    private final String GITHUB_API_BASE_URL = "https://api.github.com";

    @Autowired
    private RestTemplate restTemplate;

    public GitHubCommit getCommitDetails(String owner, String repo, String commitSha) {
        String apiUrl = GITHUB_API_BASE_URL + "/repos/" + owner + "/" + repo + "/commits/" + commitSha;
        return restTemplate.getForObject(apiUrl, GitHubCommit.class);
    }
}
