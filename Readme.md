# Aiqa Technologies BDD Automation Testing

## Prerequisites
- **JDK (v1.8 or greater)**: [Download Link](https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html)
- **Maven (v3.8.1 or greater)**: [Download Link](https://maven.apache.org/download.cgi)
- **Allure (v2.15.0 or greater)**: [Download Link](https://github.com/allure-framework/allure2/releases/download/2.15.0/allure-2.15.0.zip)
- **Eclipse (v4.22.0)**: [Download Link](https://www.eclipse.org/downloads/)

## Setup

### 1. Install JDK (v1.8 or greater)
- Download JDK from the provided link.
- Follow the installation instructions specific to your operating system:
  - **Windows**: Run the installer and follow the on-screen prompts.
  - **Mac**: Mount the `.dmg` file and run the installer.
  - **Linux**: Use your package manager (e.g., `sudo apt install openjdk-8-jdk` for Ubuntu).

### 2. Install Maven (v3.8.1 or greater)
- Download Maven from the provided link.
- To install Maven:
  - **Windows**:
    1. Extract the archive to a directory of your choice.
    2. Add the Maven `bin` directory to your system’s `PATH` environment variable.
  - **Mac/Linux**:
    1. Extract the archive to a directory of your choice (e.g., `/opt/maven`).
    2. Add Maven to your `PATH` by editing the `.bashrc` or `.zshrc` file.
    3. Run the following command: `export PATH=/opt/maven/bin:$PATH`.

### 3. Install Allure (v2.15.0 or greater)
- Download the Allure command-line tool from the provided link.
- To install Allure:
  - **Windows**:
    1. Extract the `.zip` archive to a directory.
    2. Add the Allure `bin` directory to your system’s `PATH` environment variable.
  - **Mac/Linux**:
    1. Extract the `.zip` archive to a directory.
    2. Add the Allure `bin` directory to your system’s `PATH` in `.bashrc` or `.zshrc`.

### 4. Install Eclipse (v4.22.0)
- Download Eclipse from the provided link.
- To install Eclipse:
  - **Windows/Mac/Linux**:
    1. Download the appropriate version for your system.
    2. Follow the installation instructions on the Eclipse website.
    3. After installation, launch Eclipse and configure your workspace.

### 5. Set up Project Dependencies
- Once all the prerequisites are installed, open the project in Eclipse or your preferred IDE.
- Ensure Maven is configured correctly and the necessary dependencies are loaded. You can do this by running the command:
  ```bash
  mvn clean install


### How to Generate Automation Test Reports

Follow the steps below to generate test reports:

1. **Navigate to the Project Folder**  
   Open the folder containing your project, e.g., within the project directory under the `\allure-results`, where the Allure results are stored.

2. **Open Command Prompt**  
   In the folder path area, type `cmd` and press Enter. This will open the Command Prompt.

3. **Run Allure Command**  
   In the Command Prompt, type `allure serve` and press Enter. This will start generating the test report.

4. **View the Report**  
   Once the command executes, the test report will be displayed in your browser.

## Notes
- Ensure all required tools (JDK, Maven, Allure, Eclipse) are installed correctly to run the automation tests and generate reports.
- Allure will automatically open the generated report in the default web browser after running the command.
