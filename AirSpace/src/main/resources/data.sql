
insert into airspace.address(id, city, state, street) values (1, "Beograd", "Beograd", "Beograd");
insert into airspace.address(id, city, state, street) values (2, "Novi Sad", "Novi Sad", "Novi Sad");
insert into airspace.address(id, city, state, street) values (3, "Nis", "Nis", "Nis");

insert into airspace.location(id, x, y, address_id) values (1,1,1,1);
insert into airspace.location(id, x, y, address_id) values (2,2,2,2);
insert into airspace.location(id, x, y, address_id) values (3,3,3,3);

insert into airspace.rentacar(id, address, description, name, rating) values (1, "Kneza Milosa 4", "Ovo je prva kompanija", "BeogradRent", 100);
insert into airspace.rentacar(id, address, description, name, rating) values (2, "Modene", "Ovo je druga kompanija", "NoviSadRent", 100);
insert into airspace.rentacar(id, address, description, name, rating) values (3, "Bulevar", "Ovo je trecakompanija", "NisRent", 100);

insert into airspace.branchoffice(id, address, office_name, rentacar_id) values (1, "Kneza Milosa 4", "Beograd",1);
insert into airspace.branchoffice(id, address, office_name, rentacar_id) values (2, "Modene" ,"Novi Sad", 1);
insert into airspace.branchoffice(id, address, office_name, rentacar_id) values (3, "Bulevar", "Nis",1);


insert into airspace.branchoffice(id, address, office_name,  rentacar_id) values (4, "Kneza Milosa 4", "Beograd",1);
insert into airspace.branchoffice(id, address, office_name,  rentacar_id) values (5, "Kneza Milosa 4", "Novi Sad",1);


insert into airspace.branchoffice(id, address, office_name,  rentacar_id) values (6, "Kneza Milosa 4", "Nis",  3);
insert into airspace.branchoffice(id, address, office_name, rentacar_id) values (7, "Kneza Milosa 4", "Novi Sad", 3);

insert into airspace.vehicle(id, available, city_location, gear_box, godina_proizvodnje, id_office, id_user, model, num_of_seats, price_per_day, rating, branchoffice_id, rentacar_id) values (1, 1, 'test1', 'auto', 2015, 1, 1, 'audi',5, 5, 100, 1, 1);
insert into airspace.vehicle(id, available, city_location, gear_box, godina_proizvodnje, id_office, id_user, model, num_of_seats, price_per_day, rating, branchoffice_id, rentacar_id) values (2, 1, 'test2', 'auto', 2010, 1, 1, 'bmw',5, 5, 100, 1, 1);
insert into airspace.vehicle(id, available, city_location, gear_box, godina_proizvodnje, id_office, id_user, model, num_of_seats, price_per_day, rating, branchoffice_id, rentacar_id) values (3, 1, 'test3', 'auto', 2011, 3, 1, 'mercedes',5, 5, 100, 3, 1);

insert into airspace.vehicle(id, available, city_location, gear_box, godina_proizvodnje, id_office, id_user, model, num_of_seats, price_per_day, rating, branchoffice_id, rentacar_id) values (4, 1, 'test4', 'auto', 2014, 4, 1, 'opel',5, 5, 100, 4, 1);
insert into airspace.vehicle(id, available, city_location, gear_box, godina_proizvodnje, id_office, id_user, model, num_of_seats, price_per_day, rating, branchoffice_id, rentacar_id) values (5, 1, 'test1', 'auto', 2015, 5, 1, 'nissan',5, 5, 100, 5, 1);
insert into airspace.vehicle(id, available, city_location, gear_box, godina_proizvodnje, id_office, id_user, model, num_of_seats, price_per_day, rating, branchoffice_id, rentacar_id) values (6, 1, 'test2', 'auto', 2010, 6, 1, 'toyota',5, 5, 100, 6, 3);
insert into airspace.vehicle(id, available, city_location, gear_box, godina_proizvodnje, id_office, id_user, model, num_of_seats, price_per_day, rating, branchoffice_id, rentacar_id) values (7, 1, 'test3', 'auto', 2011, 7, 1, 'subaru',5, 5, 100, 7, 3);

insert into airspace.user(id, city, company_id, email, first_name, last_name, password, phone_number, user_status, user_type, username, uuid) values('1', 'korisnik', NULL, 'a16105@urhen.com', 'korisnik', 'korisnik', '$2a$10$RjexYK2py4UrWtxxPDFdh.J9.O8fR.oAytviz9zj.ZsIivKHcj6nu', '011', '0', '0', 'korisnik', '0f7ff739-7012-4b8a-96c4-680a1f509061');
insert into airspace.user(id, city, company_id, email, first_name, last_name, password, phone_number, user_status, user_type, username, uuid) values('2', 'Novi Sad', '1', 'b816623@urhen.com', 'adminRentaCar', 'adminRentaCar', '$2a$10$L.uDKvMQCUOM8SiIHDFThubzdagCsHANjdFdIRFDO7eFgiPxQQ7nS', '021', '0', '2', 'adminrentacar', '9f116192-ab5d-48cd-b4de-94683766fbfa');


insert into airspace.reservationrentacar(id, date_from, date_until, rentacar_id, user_id, vehicle_id) values ('1', '2019-02-02 00:00:00.000000', '2019-02-08 00:00:00.000000', '1', '1', '1');
insert into airspace.reservationrentacar(id, date_from, date_until, rentacar_id, user_id, vehicle_id) values ('2', '2019-06-02 00:00:00.000000', '2019-06-04 00:00:00.000000', '1', '1', '3');
insert into airspace.reservationrentacar(id, date_from, date_until, rentacar_id, user_id, vehicle_id) values ('3', '2019-06-05 00:00:00.000000', '2019-06-08 00:00:00.000000', '1', '1', '3');



