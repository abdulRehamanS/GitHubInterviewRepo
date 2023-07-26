package In.Abdul.Git.Hub.Commits.Entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "GitHubCommits")
public class GitHubCommit {


    @Id
    @GeneratedValue
    private String commitId;
    private String author;
    private String message;
    private Date date;
}
