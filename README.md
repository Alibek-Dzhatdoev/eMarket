#### Данное приложение имеет требуемый REST-функционал, незримо реализуемый с помощью Spring Data REST.  
#### Несмотря на отсутствие кастомных контроллеров и сервисов, это небольшое приложение удовлетворяет всем требованиям ТЗ.

# Инструкция по запуску и использованию приложения:

### Шаг 1: Установка необходимого программного обеспечения

Установите Java Development Kit (JDK) версии 8 или выше, если еще не установлено.
Установите среду разработки (IDE), например IntelliJ IDEA или Eclipse (опционально).

### Шаг 2: Импорт проекта и настройка среды разработки

Скачайте и распакуйте исходный код вашего проекта или клонируйте репозиторий, если он уже существует.
Откройте среду разработки и импортируйте проект в IDE.
Дождитесь завершения процесса импорта и сборки проекта.

### Шаг 3: Запуск приложения

Откройте основной класс вашего приложения (содержащий метод main) в среде разработки.
Запустите приложение, нажав на кнопку "Run" или аналогичную в вашей IDE.
Дождитесь, пока приложение полностью запустится.

### Шаг 4: Использование HTTP-запросов
После успешного запуска приложения, вы можете использовать следующие HTTP-запросы для взаимодействия с вашим приложением.

#### 1. Добавление товара:

- URL: POST ```/products```
- Тело запроса (JSON):

```json

{
    "serialNumber": "SN123456",
    "manufacturer": "Example Manufacturer",
    "price": 100.0,
    "quantity": 10,
    "type": "DESKTOP"
}
```

Примечание: Замените type на один из возможных типов товара: "DESKTOP", "LAPTOP", "MONITOR", "HARDDRIVE".
- Ответ: Статус 201 (Created), с созданным товаром в теле ответа.

#### 2. Редактирование товара:

- URL: PUT ```/products/{id}```
- Тело запроса (JSON):

```json
{
    "serialNumber": "SN654321",
    "manufacturer": "Updated Manufacturer",
    "price": 200.0,
    "quantity": 5,
    "type": "LAPTOP"
}
```

Примечание: Замените ```{id}``` на идентификатор существующего товара.
- Ответ: Статус 200 (OK), с обновленным товаром в теле ответа.

#### 3. Просмотр всех существующих товаров по типу:

- URL: GET ```/{type}s```
Примечание: Замените {type} на один из возможных типов товара: "desktop", "laptop", "monitor", "harddrive".
- Ответ: Список всех товаров указанного типа в теле ответа.

#### 4. Просмотр товара по идентификатору:


- URL: GET  ```/products/{id}```
Примечание: Замените {id} на идентификатор существующего товара.
- Ответ: Товар с указанным идентификатором в теле ответа.
