def call(repoUrl, branchName) {
    git url: "${repoUrl}", branch: "${branchName}"
}
