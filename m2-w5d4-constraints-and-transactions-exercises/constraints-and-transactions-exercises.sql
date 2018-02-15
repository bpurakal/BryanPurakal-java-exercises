-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
        INSERT into actor (first_name, last_name) values ('Hampton', 'Avenue');
        INSERT into actor (first_name, last_name) values ('Lisa', 'Byway');
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	
        INSERT into film (title, description, release_year, language_id, length ) values ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 
        2008, (SELECT language_id from language WHERE name = 'English'), 198);
        
        SELECT * from film WHERE title = 'Euclidean PI';
        
    --    DELETE FROM film where film_id = 1002;
        
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

        BEGIN TRANSACTION;
        
        SELECT * from actor WHERE actor_id = 202;
        
        INSERT INTO film_actor (actor_id, film_id) values (201, 1001);
        INSERT INTO film_actor (actor_id, film_id) values (202, 1001);
        
        select * from film_actor where film_id = 1001;
        
        ROLLBACK;                                                                             

-- 4. Add Mathmagical to the category table.

        BEGIN TRANSACTION
        INSERT into CATEGORY (category_id, name) values (17, 'Mathmagical');
        
        ROLLBACK;
        

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
        
        BEGIN TRANSACTION 
        UPDATE film_category
        set category_id ='17'
        where film_id = 1001 OR film_id = 274 OR FILM_ID = 494 OR film_id = 714 OR FILM_ID= 996; 
        
        ROLLBACK;


-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)
        
        begin transaction
        update film 
        set rating = 'G'
        where film_id = 1001 OR film_id = 274 OR FILM_ID = 494 OR film_id = 714 OR FILM_ID= 996; 
        rollback;
-- 7. Add a copy of "Euclidean PI" to all the stores.
        
        BEGIN TRANSACTION 
        INSERT INTO inventory (film_id, store_id) values (1001, 1);
        INSERT INTO inventory (film_id, store_id) values (1001, 2);
        ROLLBACK;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)
        begin transaction 
        delete from film 
        where film_id = 1001;
        rollback;
        
        -- no because [Code: , SQL State: 23503]  ERROR: update or delete on table "film" violates foreign key constraint "film_actor_film_id_fkey" on table "film_actor"
       -- Detail: Key (film_id)=(1001) is still referenced from table "film_actor".

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)
        BEGIN TRANSACTION
        DELETE from category
        where category_id = 17;
        select * from category where category_id = 17;
        rollback;
        --yes because apparently the foreign key constraint is not being referenced in another table 
        --but when others around me tried this they were not able to

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)
        
        begin transaction
        delete from film_category 
        where category_id = 17;
        rollback;
        --yes because number 9 (already deleted) but else wise its bc the primary key is being deleted.
        
-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)
            BEGIN TRANSACTION
        DELETE from category
        where category_id = 17;
        select * from category where category_id = 17;
        rollback;
        --yes for the same reason as #9 though 

-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

        --we would need to delete references of Euclidean PI (PK) in the film_category and film_actor tables before we 
        -- could delete the film itself bc the film_id is primary key in each respective table. 
