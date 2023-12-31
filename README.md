Тестовое задание

## Реализовать REST API для работы с товаром и массивом его характеристик. 

Это должно быть минимум две таблицы в базе. 

### Контроллер должен позволять выполнять CRUD операции:

 - Получить список товаров в сокращенном виде - только основные свойства товара (например, название и цена).
   - Товары должны выводиться постранично – реализовать пагинацию.
   - Должна быть возможность отсортировать товар различными способами по любым имеющимся в сокращенном представлении атрибутам, например, по убыванию/возрастанию цены, или по названию. Или по названия, а для тех, которые имеют одинаковые названия – по цене.
   - Реализовать возможность наложить фильтр на любое имеющееся в сокращенном представлении свойство или сразу на несколько. Например, получить товары не дороже заданной цены (подсказка: можно использовать QueryDSL).
   - Пагинация сортировка и фильтрация должны работать совместно.
   - При добавлении в модель товара новых атрибутов, например, появится поле «производитель», реализации сортировки и фильтрации должны работать, в том числе по новым атрибутам, без внесения в программу иных изменений (только модель).
 - Получить развёрнутое описание одного товара: название, цена, описание и массив всех его характеристик.
 - Создать новый товар со списком его характеристик.
 - Изменить один выбранный товар, меняя значения любых его атрибутов или характеристик. Может так же измениться количество характеристик.
 - Удалить товар. Связанные с ним характеристики, так же должны быть удалены из базы данных.

При создании и изменении товара, вводимые пользователем данные должны быть провалидированы программой, например, не допускается создавать товары с нулевой или отрицательной ценой (подсказка: можно использовать Spring Validation).

### Требования к реализации:
 - применять фреймворк Spring Boot
 - для сборки использовать Apache Maven
 - в качестве СУБД допускается использовать H2 или PostgreSQL
 - для работы с базой данный, использовать JPA

### Будет преимуществом:
 - написание нескольких тестов для проверки работоспособности.


