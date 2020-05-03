create database school;
use school;
create table sinhvien (
id int primary key auto_increment,
hoten varchar(100) not null,
namsinh date,
sodienthoai varchar(20)
);
insert into sinhvien(hoten, namsinh, sodienthoai) values ('Đỗ Duy Thịnh', '1999/08/24', '0377725445');
insert into sinhvien(hoten, namsinh, sodienthoai) values ('Huấn', '2008/04/22', '0912325345');
insert into sinhvien(hoten, namsinh, sodienthoai) values ('Micheal Mun', '1978/04/24', '0912321545');
insert into sinhvien(hoten, namsinh, sodienthoai) values ('Mel B', '1980/03/01', '0966655455');
insert into sinhvien(hoten, namsinh, sodienthoai) values ('Khá Văn Giỏi', '1970/10/13', '0123425555');
insert into sinhvien(hoten, namsinh, sodienthoai) values ('Nguyễn Thị Tên', '1982/04/20', '0974425000');
