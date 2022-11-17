# Demonstration test automation project for Wikipedia app


## Content

> ➠ [Covered functionality](#Covered-functionality)
>
> ➠ [Technology stack](#classical_building-Technology-stack)
>
> ➠ [Running tests from the terminal](#Running-tests-from-the-terminal)
>
> ➠ [Test results report in Allure Report](#skier-Test-results-in-allure-Report)
>
> ➠ [An example of running a test in Browserstack](#An-example-of-running-a-test-in-Browserstack)

## :tshirt: Covered functionality

> Autotests developed <code>Mobile</code>.

### Mobile

- [x] Check searching an article
- [x] Check opening an article
- [x] Check All tabs on main page


## :abacus: Technology stack

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title=Browserstack" src="images/logo/browserstack-icon.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Appium" src="images/logo/Appiun.svg">
</p>

In this project, autotests are written in <code>Java</code> with <code>Selenide</code> and <code>Appium</code> for Mobile tests.

> <code>Owner</code> library provide credentials data (the file located locally).
> 
> <code>Browserstack</code> launches  test remotely.
>
> Local launch with <code>Virtual Device Manager</code>
>
> Launch on real device with <code>Appium</code>
>
> <code>Allure Report</code> generates a test run report.
> 
> <code>Gradle</code> is used for automated project build.
>
> <code>JUnit 5</code> is used as a unit testing library.
>
> <code>Jenkins</code> runs the tests.

## Running tests from the terminal

### :desktop_computer: Running Tests Locally

```
gradle clean test
-Ddevice.launch = ${device.launch}
```
test launch options
```
${device.launch} = remote (remote launch tests with <code>Browserstack</code>)
${device.launch} = local (local launch tests with mobile emulator)
${device.launch} = remote (launch tests on your real device)

```

### :desktop_computer: Remote test running

```
clean test
-Ddevice.launch = ${device.launch}
```
### :desktop_computer: Add file <code>credentials.properties</code> with data
```
browserstack.user =browserstack user
browserstack.key =browserstack user key
browserstack.url=http://hub.browserstack.com/wd/hub  (browserstack url)
app=browserstack installed app url
device=Google Pixel 3   (browserstack device name)
real.device=real device name (code)
os_version=browserstack android version
project= project name
build= build name
name= test's name
local.name=Pixel 4 API 30 (emulated device name)
local.platform=Android (emulated device platform name)
local.version=11.0 (emulated device platform version)
real.version=11.0 (real device platform versiom)
app.package=org.wikipedia.alpha (name of app package)
app.activity=org.wikipedia.main.MainActivity (name of app activity)
app.url= local appium server link
app.path=src/test/resources/apps/app-alpha-universal-release.apk local app link
app.baseurl=https://github.com/wikimedia/apps-android-wikipedia/releases/download/latest/app-alpha-universal-release.apk (app link from github)

```



### :scroll: Main page of <code>Allure-report</code>

> После завершения сборки, запуск отображается в <code>Allure Report</code>.


<p align="center">
<img title="Allure Overview Dashboard" src="images/screens/allure.PNG">
</p>


### :scroll: Основной дашборд в <code>Allure TestOps</code>

> После завершения сборки, запуск отображается в <code>Allure TestOp</code>.

<p align="center">
<img title="Allure TestOps Overview Dashboard" src="images/screens/AllureTestOps.PNG">
</p>


## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Уведомления в Telegram с использованием бота

> После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне.

<p align="center">
<img title="Telegram Notifications" src="images/screens/Telegram.PNG">
</p>

### :scroll: Интеграция <code>Allure TestOps</code> с <code>Jira</code>

> После завершения сборки, запуск отображается в <code>Allure TestOp</code>, автоматически обрабатывает и отображается в <code>Jira</code>.

<p align="center">
<img title="Allure Overview" src="images/screens/Jira.PNG">
</p>

## <img width="4%" title="Selenoid" src="images/logo/Selenoid.svg"> Пример запуска теста в Selenoid

> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/gifs/Selenoid.gif">
</p>
