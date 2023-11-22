# T1-entry-task

Это проект для выполнения тестового задания.

## Сборка проекта

Для сборки проекта используйте Gradle. Перейдите в корневую директорию проекта и выполните следующую команду(linux):

```bash
./gradlew build
```

На windows команда:

```bash
gradlew.bat build
```

После успешной сборки, в директории build/libs будет создан исполняемый JAR-файл T1-entry-task-0.0.1-SNAPSHOT.jar.

## Запуск программы

Запустите программу с помощью команды java -jar указанием имени JAR-файла:

```bash
java -jar build/libs/T1-entry-task-0.0.1-SNAPSHOT.jar
```

После этой команды сервер запустится и можно отправлять запросы.

Также возможно посмотреть результаты тестов написав команду(linux):

```bash
./gradlew test
```

На windows команда:

```bash
gradlew.bat test
```

Результаты будут лежать в директории build/test-results в виде xml файлов.

## Формат запроса

Сервер принимает POST запросы по адресу http://localhost:8080/api/v1/frequency. Тело запроса должно быть в json формате и содержать только поле "text", в него нужно написать строку частоту символов которой нужно получить.
Ответ также приходит в формате json. Для отправки запросов можно использовать Postman или консольные утилиты.

Пример запроса:

{
"text" : "aaaaabcccc"
}

Пример ответа:

{
"a": 5,
"c": 4,
"b": 1
}
