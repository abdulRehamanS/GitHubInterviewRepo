package In.Abdul.Git.Hub.Commits.Controller;


import In.Abdul.Git.Hub.Commits.Entity.GitHubCommit;
import In.Abdul.Git.Hub.Commits.Service.GitHubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubCommitController {
    @Autowired
    private GitHubService gitHubService;

    @GetMapping("/commits/{owner}/{repo}/{commitSha}")
    public GitHubCommit getCommitDetails(@PathVariable String owner,
                                         @PathVariable String repo,
                                         @PathVariable String commitSha) {
        return gitHubService.getCommitDetails(owner, repo, commitSha);
    }


    @GetMapping(value = "/")
    public String getSms() {
        return "welcome to Git Hub";
    }
}
