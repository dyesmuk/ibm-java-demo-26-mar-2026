# 🚀 Git & GitHub – Complete Training Guide

> A comprehensive onboarding guide for new developers and trainees.  
> Estimated study time: **0.5 days**

---

## 📋 Table of Contents

1. [Welcome](#-welcome)
2. [Git Basics](#-git-basics)
3. [Undoing Things](#-undoing-things)
4. [The Basics of GitHub](#-the-basics-of-github)
5. [Working with Branches](#-working-with-branches)
6. [Forking and Contributing](#-forking-and-contributing)
7. [Collaboration](#-collaboration)
8. [Quick Reference Cheat Sheet](#-quick-reference-cheat-sheet)

---

## 👋 Welcome

### What is Version Control?

Version control is a system that records changes to files over time so you can recall specific versions later. Think of it as a **"time machine" for your code**.

Without version control:
- You overwrite files and lose previous work
- Collaborating with others causes conflicts
- You have no history of *what* changed or *why*

### What is Git?

**Git** is a free, open-source **distributed version control system** created by Linus Torvalds in 2005. It is:
- Fast and lightweight
- Works entirely on your local machine (no internet needed)
- Industry standard across the software world

### What is GitHub?

**GitHub** is a cloud-based platform that hosts Git repositories online. It adds:
- A visual interface for your Git history
- Tools for team collaboration (Pull Requests, Issues, Reviews)
- Project management features

> 💡 **Key distinction:** Git is the tool. GitHub is the platform. You can use Git without GitHub, but not the other way around.

### Installation & Setup

#### Install Git
- **Windows:** Download from [https://git-scm.com](https://git-scm.com)
- **macOS:** Run `xcode-select --install` in Terminal
- **Linux (Ubuntu/Debian):** `sudo apt install git`

#### Configure Your Identity
After installing, tell Git who you are. This information is attached to every commit you make.

```bash
git config --global user.name "Your Full Name"
git config --global user.email "you@example.com"
```

#### Verify Configuration
```bash
git config --list
```

---

## 🧱 Git Basics

### Core Concepts

| Concept | Description |
|---|---|
| **Repository (Repo)** | A folder tracked by Git containing your project files and history |
| **Working Directory** | The actual files on your computer you are editing |
| **Staging Area (Index)** | A preparation zone where you select what goes into the next commit |
| **Commit** | A saved snapshot of staged changes, permanently recorded in history |
| **HEAD** | A pointer to the latest commit on your current branch |

### The Git Workflow

```
Working Directory  →  Staging Area  →  Local Repository  →  Remote Repository
   (edit files)       (git add)          (git commit)          (git push)
```

---

### Initializing a Repository

**Start tracking a new project:**
```bash
mkdir my-project
cd my-project
git init
```
This creates a hidden `.git/` folder — Git's brain for the project.

**Clone an existing repository:**
```bash
git clone https://github.com/username/repository-name.git
```
This downloads the entire project and its history to your machine.

---

### Tracking Changes

#### Check the status of your files
```bash
git status
```
Outputs which files are modified, staged, or untracked.

#### Stage files for commit
```bash
# Stage a specific file
git add filename.txt

# Stage multiple files
git add file1.txt file2.txt

# Stage all changes in the current directory
git add .
```

#### Commit staged changes
```bash
git commit -m "Your descriptive commit message"
```

> ✅ **Good commit message:** `"Add user login validation logic"`  
> ❌ **Bad commit message:** `"fixed stuff"` or `"changes"`

#### Stage and commit in one step (tracked files only)
```bash
git commit -am "Your message"
```

---

### Viewing History

```bash
# Full commit history
git log

# Compact one-line history
git log --oneline

# Visual branch history
git log --oneline --graph --all

# View changes in a specific commit
git show <commit-hash>
```

---

### Comparing Changes

```bash
# See unstaged changes
git diff

# See staged (but not yet committed) changes
git diff --staged

# Compare two commits
git diff <commit1> <commit2>
```

---

### Ignoring Files

Create a `.gitignore` file to exclude files from tracking:

```
# .gitignore example
node_modules/
*.log
.env
.DS_Store
dist/
```

> 💡 Add `.gitignore` before your first commit to avoid tracking unwanted files.

---

## ↩️ Undoing Things

This is one of the most important skills — knowing how to safely reverse mistakes.

### Undo Levels Overview

```
[Working Dir]  →  [Staging Area]  →  [Committed]  →  [Pushed to Remote]
   git restore      git restore        git revert /       (be very careful)
                    --staged           git reset
```

---

### 1. Discard Changes in the Working Directory

You've edited a file but haven't staged it yet and want to throw away the changes:

```bash
git restore filename.txt
```
> ⚠️ This is **permanent** — uncommitted changes will be lost.

---

### 2. Unstage a File (Keep the Changes)

You staged a file by mistake but still want to keep your edits:

```bash
git restore --staged filename.txt
```
The file goes back to the working directory as modified.

---

### 3. Amend the Last Commit

Fix a typo in your commit message or add a forgotten file:

```bash
# Fix the commit message
git commit --amend -m "Corrected commit message"

# Add a forgotten file and amend
git add forgotten_file.txt
git commit --amend --no-edit
```
> ⚠️ Only use `--amend` on commits **not yet pushed** to a remote.

---

### 4. Revert a Commit (Safe – Keeps History)

Creates a **new commit** that undoes the changes of a previous one. Safe to use on shared/remote branches.

```bash
git revert <commit-hash>
```

Example:
```bash
git log --oneline
# a1b2c3d  Added broken feature
# e4f5g6h  Previous stable state

git revert a1b2c3d
# Git creates a new commit that undoes a1b2c3d
```

---

### 5. Reset (Rewrite History – Use with Caution)

`git reset` moves the HEAD pointer backward. There are three modes:

| Mode | Staged Area | Working Directory | Use Case |
|---|---|---|---|
| `--soft` | Keeps changes staged | Unchanged | Re-commit with different message/files |
| `--mixed` (default) | Clears staging | Keeps edits | Redo staging from scratch |
| `--hard` | Clears staging | **Discards edits** | Nuclear option — complete undo |

```bash
# Undo last commit, keep changes staged
git reset --soft HEAD~1

# Undo last commit, keep changes but unstaged
git reset --mixed HEAD~1

# Undo last commit AND discard all changes
git reset --hard HEAD~1
```

> ❌ **Never use `git reset` on commits already pushed to a shared remote branch.** Use `git revert` instead.

---

### 6. Recover Lost Work with Reflog

Even after a hard reset, Git keeps a secret log of all HEAD movements:

```bash
git reflog
# Find the commit hash you want to recover
git checkout <lost-commit-hash>
```

---

## 🐙 The Basics of GitHub

### Creating a GitHub Account

1. Go to [https://github.com](https://github.com)
2. Sign up with your email
3. Verify your email address
4. (Recommended) Enable two-factor authentication

---

### Setting Up SSH Authentication

SSH keys let you connect to GitHub without typing your password every time.

```bash
# Step 1: Generate a key pair
ssh-keygen -t ed25519 -C "you@example.com"

# Step 2: Copy the public key
cat ~/.ssh/id_ed25519.pub

# Step 3: Add to GitHub
# Go to GitHub → Settings → SSH and GPG keys → New SSH key → Paste
```

Test your connection:
```bash
ssh -T git@github.com
# Hi username! You've successfully authenticated.
```

---

### Creating a Repository on GitHub

1. Click the **+** icon → **New repository**
2. Name your repository
3. Choose **Public** or **Private**
4. Optionally add a README, `.gitignore`, or license
5. Click **Create repository**

---

### Connecting Local Repo to GitHub

```bash
# Add remote origin (first time)
git remote add origin https://github.com/username/repo-name.git

# Verify remotes
git remote -v

# Push local commits to GitHub
git push -u origin main
```

The `-u` flag sets `origin main` as the default upstream so future pushes only need `git push`.

---

### Common Remote Commands

```bash
# Push changes to remote
git push

# Pull latest changes from remote
git pull

# Fetch changes without merging
git fetch

# View all remotes
git remote -v

# Change remote URL
git remote set-url origin <new-url>
```

---

### Understanding the GitHub Interface

| Section | Purpose |
|---|---|
| **Code** | Browse files and commit history |
| **Issues** | Report bugs, request features, track tasks |
| **Pull Requests** | Propose and review code changes |
| **Actions** | Automate workflows (CI/CD) |
| **Insights** | Contribution graphs, traffic stats |
| **Settings** | Manage repo access, branches, webhooks |

---

## 🌿 Working with Branches

### Why Branches?

Branches let you work on new features, bug fixes, or experiments **in isolation** without disturbing the main codebase. Once the work is complete and reviewed, it gets merged back.

```
main  ──●──●──────────────────────●── (stable)
              \                  /
feature/login  ●──●──●──●──●────   (isolated work)
```

---

### Branch Commands

```bash
# List all local branches
git branch

# List all branches (local + remote)
git branch -a

# Create a new branch
git branch feature/new-login

# Switch to a branch
git checkout feature/new-login

# Create and switch in one command (recommended)
git checkout -b feature/new-login

# Modern syntax (Git 2.23+)
git switch -c feature/new-login
```

---

### Naming Conventions

Use clear, descriptive branch names:

| Pattern | Example |
|---|---|
| `feature/` | `feature/user-authentication` |
| `bugfix/` | `bugfix/fix-login-redirect` |
| `hotfix/` | `hotfix/payment-crash` |
| `release/` | `release/v2.1.0` |
| `chore/` | `chore/update-dependencies` |

---

### Merging Branches

Once your feature is ready, merge it back into `main`:

```bash
# Switch to the target branch
git checkout main

# Merge the feature branch
git merge feature/new-login
```

#### Fast-Forward Merge
If `main` hasn't changed since the branch was created, Git simply moves the pointer forward — no merge commit needed.

#### Three-Way Merge
If both branches have new commits, Git creates a **merge commit** combining both histories.

---

### Resolving Merge Conflicts

A conflict occurs when two branches change the **same line** of the same file.

```bash
# After a conflict, Git marks the file:
<<<<<<< HEAD
  Your change on main
=======
  Incoming change from feature branch
>>>>>>> feature/new-login
```

**Steps to resolve:**
1. Open the conflicted file
2. Choose which change to keep (or combine both)
3. Remove the conflict markers (`<<<<<<<`, `=======`, `>>>>>>>`)
4. Stage the resolved file: `git add filename.txt`
5. Complete the merge: `git commit`

> 💡 **Tools like VS Code, IntelliJ, and GitKraken have built-in merge conflict editors.**

---

### Deleting Branches

```bash
# Delete a local branch (safe — only if merged)
git branch -d feature/new-login

# Force delete (even if not merged)
git branch -D feature/new-login

# Delete a remote branch
git push origin --delete feature/new-login
```

---

### Rebasing (Advanced)

`git rebase` replays your commits on top of another branch, creating a **linear history**:

```bash
git checkout feature/new-login
git rebase main
```

> ⚠️ Never rebase commits that have been pushed to a shared remote branch.

---

## 🍴 Forking and Contributing

### What is a Fork?

A **fork** is your own personal copy of someone else's repository on GitHub. You can make changes freely without affecting the original project.

```
Original Repo (upstream)
        ↓  fork
  Your Fork (origin)
        ↓  clone
  Local Machine
```

---

### Fork Workflow – Step by Step

#### Step 1: Fork the Repository
On GitHub, navigate to the original repo and click **Fork** (top-right). Select your account.

#### Step 2: Clone Your Fork
```bash
git clone https://github.com/YOUR-USERNAME/repo-name.git
cd repo-name
```

#### Step 3: Add the Original Repo as "Upstream"
```bash
git remote add upstream https://github.com/ORIGINAL-OWNER/repo-name.git
git remote -v
# origin    → your fork
# upstream  → original repo
```

#### Step 4: Create a Feature Branch
```bash
git checkout -b feature/my-contribution
```

#### Step 5: Make Your Changes
Edit files, then stage and commit:
```bash
git add .
git commit -m "Add: describe your change clearly"
```

#### Step 6: Push to Your Fork
```bash
git push origin feature/my-contribution
```

#### Step 7: Open a Pull Request
1. Go to your fork on GitHub
2. Click **Compare & pull request**
3. Write a clear title and description
4. Submit the Pull Request to the original repo

---

### Keeping Your Fork Up to Date

Sync your fork with the latest changes from upstream:

```bash
git fetch upstream
git checkout main
git merge upstream/main
git push origin main
```

---

### Writing a Good Pull Request

A well-written PR increases the chance it gets reviewed and merged quickly.

**PR Title:** Clear and concise  
`"Fix: Resolve null pointer exception in user login"`

**PR Description should include:**
- What problem does this solve?
- What approach did you take?
- Screenshots (if UI changes)
- How to test the changes
- Any known limitations

---

## 🤝 Collaboration

### The Standard Team Workflow

```
1. Pull latest changes from main
2. Create a new branch for your task
3. Develop and commit locally
4. Push branch to remote
5. Open a Pull Request
6. Code Review by teammates
7. Address feedback with new commits
8. PR is approved and merged into main
9. Delete feature branch
10. Repeat
```

---

### Pull Requests (PRs) in Depth

A Pull Request is a **request to merge** one branch into another. It is the central collaboration tool on GitHub.

```bash
# Typical PR flow
git checkout -b feature/search-bar
# ... make commits ...
git push origin feature/search-bar
# Open PR on GitHub → Review → Merge
```

**PR best practices:**
- Keep PRs small and focused (one feature/fix per PR)
- Add reviewers and labels
- Link related Issues (`Closes #42`)
- Don't merge your own PRs without review (on teams)

---

### Code Reviews

As a **reviewer**, your job is to:
- Understand what the PR is trying to do
- Check for correctness, clarity, and edge cases
- Leave constructive, specific comments
- Approve or request changes

**GitHub Review Comments:**
- 💬 **Comment** – General feedback, no approval
- ✅ **Approve** – LGTM (Looks Good To Me)
- 🔄 **Request changes** – Changes needed before merge

---

### Issues

Issues are used to **track bugs, features, and tasks**.

```
Title: Button click crashes on mobile
Labels: bug, high-priority
Assignee: @dev-alice
Milestone: v2.0 Release
```

**Linking commits to issues:**
```bash
git commit -m "Fix: resolve crash on mobile button click — Closes #15"
```
This automatically closes Issue #15 when the commit is merged into main.

---

### Protecting the Main Branch

In **GitHub → Settings → Branches**, add a branch protection rule for `main`:

| Rule | Recommended Setting |
|---|---|
| Require PR before merging | ✅ Enabled |
| Require approvals | At least 1 reviewer |
| Require status checks to pass | ✅ (if using CI) |
| Restrict who can push | Admins only |

---

### GitHub Actions (CI/CD Basics)

Automate testing and deployment with GitHub Actions:

```yaml
# .github/workflows/test.yml
name: Run Tests

on: [push, pull_request]

jobs:
  test:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
      - name: Set up Node.js
        uses: actions/setup-node@v3
        with:
          node-version: '18'
      - run: npm install
      - run: npm test
```

Every push and PR now automatically runs tests. ✅

---

### Tags and Releases

Mark specific commits as official versions:

```bash
# Create a tag
git tag v1.0.0

# Tag a specific commit
git tag v1.0.0 <commit-hash>

# Push tags to remote
git push origin --tags
```

On GitHub: **Releases → Create a new release** — attach binaries, release notes, and changelogs.

---

## 📌 Quick Reference Cheat Sheet

### Setup
```bash
git config --global user.name "Name"
git config --global user.email "email"
```

### Repository
```bash
git init                        # Initialize a repo
git clone <url>                 # Clone a repo
```

### Staging & Committing
```bash
git status                      # Check status
git add <file>                  # Stage a file
git add .                       # Stage all changes
git commit -m "message"         # Commit staged changes
git commit -am "message"        # Stage + commit tracked files
```

### History
```bash
git log                         # Full history
git log --oneline               # Compact history
git diff                        # Unstaged changes
git diff --staged               # Staged changes
```

### Undoing
```bash
git restore <file>              # Discard working dir changes
git restore --staged <file>     # Unstage a file
git commit --amend              # Fix last commit
git revert <hash>               # Undo commit (safe)
git reset --soft HEAD~1         # Undo commit, keep staged
git reset --hard HEAD~1         # Undo commit, discard changes
```

### Remote
```bash
git remote add origin <url>     # Link to remote
git push -u origin main         # First push
git push                        # Subsequent pushes
git pull                        # Fetch + merge
git fetch                       # Fetch only
```

### Branches
```bash
git branch                      # List branches
git checkout -b <name>          # Create and switch branch
git switch <name>               # Switch branch
git merge <branch>              # Merge into current
git branch -d <name>            # Delete branch
```

### Collaboration
```bash
git remote add upstream <url>   # Add upstream
git fetch upstream              # Fetch upstream
git merge upstream/main         # Sync with upstream
```

---

## 📚 Additional Resources

| Resource | Link |
|---|---|
| Official Git Documentation | https://git-scm.com/doc |
| GitHub Docs | https://docs.github.com |
| Pro Git Book (Free) | https://git-scm.com/book |
| GitHub Learning Lab | https://skills.github.com |
| Visualizing Git | https://git-school.github.io/visualizing-git |
| Oh Shit, Git! (Common Fixes) | https://ohshitgit.com |

---

> 📝 **Prepared for internal training use.**  
> Feel free to ask your trainer if you have any questions during the session!

---

*Last updated: April 2026*
