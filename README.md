# Chapter 3: Collaborating Across the Enterprise with Git, Jira, and Confluence

This repository contains the code from the book for Chapter 3, Collaborating Across the Enterprise with Git, Jira, and Confluence. See the [main book page](https://github.com/realworldjava) for the list of all chapter specific repositories.

# How this repository is organized

In this repository,there are five branches. Some are created by following along with the chapter. Others are used by sections of the chapter.

| Branch Name  | Contents |
| ------------- | ------------- |
| main | Default branch |
| my-branch | Created in Fetching, Merging, and Pulling section| |
| develop | Created in Fetching, Merging, and Pulling section|
| refactoring2 | Created in Playing with Branches section|
| feature/refactoring | Used in git log section |

# How to use the examples in this chapter

GitHub:

*To install* Git, head over to the [Git documentation page](https://git-scm.com/downloads). You will find installation instructions for Windows, MacOS, and Linux. The git commands are in the next section in case you want to copy/paste.

Then follow along with the book using the repository as a reference.

Jira/Confluence:

Both these tools are free to try in the cloud:
* [Jira](https://www.atlassian.com/software/jira)
* [Confluence](https://www.atlassian.com/software/confluence)

# Git commands used in this chapter

Installing Git
```
git config --global user.name "Your Name"
git config --global user.email you@example.com
```
Understanding Git Workflow by Example
```
git clone https://github.com/<your git id>/Ch03-Collaboration
git status
git rm --cached -r com/wiley/realworldjava/gitplay/
git add .gitignore
git commit -m "Added .gitignore"
git branch refactoring1
git branch -d refactoring1
git checkout refactoring1
git checkout -b refactoring1
git switch refactoring1
git switch -c refactoring1
git branch
git branch -a
cd ./main/java/com/wiley/realworldjava/gitplay
git add GitDemo.java
git commit -m "Added a line to GitDemo"
git push origin refactoring1
git push
git remote get-url origin
git remote add other-machine <url>
git remote -
```

.gitignore
```
# Ignore the entire .idea directory
.idea
# Ignore the output directory.
out/
```

Fetching, Merging, and Pulling
```
git fetch origin my-branch
git merge origin my-branch
git checkout develop
git merge –no-ff my-branch
git pull origin my-branch
git config --global pull.ff only
```

Playing with Branches
```
git switch main
git switch -c refactoring2
git commit -am "added setAndDisplayDescription"
git merge refactoring1
git switch main
git switch -c refactoring3
git add GitDemo.java
git commit -m "added conflicting code"
git merge refactoring1
git merge --abort
git add GitDemo.java
git commit -m "resolved conflict"
```

Using the Git Log
```
git log --graph --oneline
git log --graph --oneline refactoring1
git log --graph --oneline --all --pretty=format:'%h %an %ar -%s'
```

Rebasing
```
git switch -c feature
git commit -am "changes to feature for rebase"
git commit -am "more changes to feature for rebase"
git switch refactoring3
git commit -am "more changes to refactoring3"
git branch -c refactoring3a
git merge feature
git switch refactoring3
git rebase feature
git log --graph --oneline refactoring3
git log --graph --oneline refactoring3a
```

Cherry-picking
```
git switch refactoring1
git cherry-pick <commit>
git commit -am "Cherry picked and then resolved conflict"
```



# Clickable Links from the Further References Section

* [Complete Git Reference documentation](https://git-scm.com/docs)
* [Original Gitflow article by Vincent Driessen](https://nvie.com/posts/a-successful-git-branching-model)
* [Jira documentation](https://www.atlassian.com/software/jira)
* [Confluence documentation](https://www.atlassian.com/software/confluence)
