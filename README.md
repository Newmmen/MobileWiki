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
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

В данном проекте автотесты написаны на <code>Java</code> с использованием <code>Selenide</code> для UI-тестов.

> Библиотека <code>Owner</code> передает данные для логина (файл расположен локально)
> 
> <code>Selenoid</code> выполняет запуск браузеров в контейнерах <code>Docker</code>.
>
> <code>Allure Report</code> формирует отчет о запуске тестов.
> 
> <code>Allure TestOps</code> формирует расширенный отчет о запуске тестов, отображает сформированные тест-кейсы
> 
> Для автоматизированной сборки проекта используется <code>Gradle</code>.
>
> В качестве библиотеки для модульного тестирования используется <code>JUnit 5</code>.
>
> <code>Jenkins</code> выполняет запуск тестов.
> 
> Сфомированные в <code>Allure TestOps</code> тест-кейсы и запуски прогона отображаются на выбраном тикете в <code>Jira</code>.
>  
>  После завершения прогона отправляются уведомления с помощью бота в <code>Telegram</code>.

## Запуск тестов из терминала

### :desktop_computer: Локальный запуск тестов

```
gradle clean test
```

### :desktop_computer: Удаленный запуск тестов

```
clean
WebTests
-Dselenide.remote=${REMOTE}
-Dbrowser_size=${BROWSER_SIZE}
-Dbrowser_name=${BROWSER_NAME}
-Dbrowser_version=${BROWSER_VERSION}
```
### :desktop_computer: Добавить файл <code>credentials.properties</code> с зарегестрированым аккаунтом IMDB.com
```
user.email={user email}
user.name={user name}
user.password={user password}

```


### :desktop_computer: Параметры сборки

> <code>REMOTE_URL</code> – адрес удаленного сервера, на котором будут запускаться тесты.
>
> <code>BROWSER</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).
>
> <code>BROWSER*VERSION</code> – версия браузера, в которой будут выполняться тесты (*по умолчанию - <code>99.0</code>\_).
>
> <code>BROWSER*SIZE</code> – размер окна браузера, в котором будут выполняться тесты (*по умолчанию - <code>1920x1080</code>\_).




### :scroll: Основной дашборд в <code>Allure Report</code>

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
