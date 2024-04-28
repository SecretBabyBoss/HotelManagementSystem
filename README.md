This is a CLONE, and I made this project from Youtube.

In this project “Hotel Management System” I have tried to show how the data/information in hotels is managed. This is just an overview of management in hotels. It manages and maintains the records of customers, rooms, employees and drivers in the hotel. The project is aimed to maintain the day-to-day state of admission/vacation of Residents, List of employees, room details etc. Main objective of this project is to provide a solution for hotels to manage most their work using computerized processes.
This software application will help admin to handle customer information, room allocation details, Payment details etc.
The rooms have different categories like single bed, double bed etc. so their charges and records will be maintained accordingly.
This software has been made in a user friendly interface, so that anyone can add, delete, update the entries and handle all the transactions easily. As a security I have provided Admin username and Password.
The project, Hotel Management System is a desktop-based application that allows the hotel manager to handle all hotel activities online. Interactive GUI and the ability to manage various rooms, employees, drivers and customers make this system very flexible and convenient. This application gives managers the power and flexibility to manage the entire system from a single online system. Hotel management project provides room booking, staff management and other necessary hotel management features. The system allows the manager to post available rooms in the system.

Front End - Java Swing
Back End - MySQL

----------------
Database Queries
----------------

create database hotelmanagementsystem;

show databases;

use hotelmanagementsystem;

create table login(username varchar(25), password varchar(25));

insert into login values('admin', '12345');

select * from login;

create table employee(name varchar(25), age varchar(10), gender varchar(15), job varchar(30), salary varchar(15), phone varchar(15), email varchar(40), aadhar varchar(20));

describe employee;

select * from employee;

create table room(roomnumber varchar(10), availability varchar(20), cleaning_status varchar(20), price varchar(20), bed_type varchar(20));

select * from room;

update room set availability = 'Available' where roomnumber = '101';

create table driver(name varchar(20), age varchar(10), gender varchar(15), company varchar(20), branch varchar(20), available varchar(20), location varchar(40));

select * from driver;

ALTER TABLE driver RENAME COLUMN branch TO brand;

create table customer(document varchar(20), number varchar(30), name varchar(30), gender varchar(15), country varchar(20), room varchar(10), checkintime varchar(80), deposit varchar(20));

select * from customer;

create table department(department varchar(30), budget varchar(30));

insert into department values('Front Office','500000');
insert into department values('Housekeeping', '40000');
insert into department values('Food and Beverage', '23000');
insert into department values('Kitchen or Food Production', '540000');
insert into department values('Security', '320000');

select * from department;
