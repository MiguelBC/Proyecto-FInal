package edu.progra2.loanMORENO.repository;
import java.util.List;

import edu.progra2.loanMORENO.model.Salary;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface SalaryRepository  {

    @Select("select * from salary")
    List<Salary> findAll();

    @Insert("INSERT INTO practica2.salary (dni, nombre, correo, sueldo,uit,total_impuesto, total_bruto,total_neta,retencion_mensual," +
            "maximo_5, monto_afecto_5, impuesto_5,maximo_20,monto_afecto_20, impuesto_20,maximo_35,monto_afecto_35,impuesto_35,maximo_45,monto_afecto_45,impuesto_45,maximo_46,monto_afecto_46,impuesto_46,total_monto_afecto) values" +
            " (#{dni},#{nombre},#{correo},#{sueldo},#{uit},#{total_impuesto},#{total_bruto}, #{total_neta},#{retencion_mensual}," +
            "#{maximo_5},#{monto_afecto_5},#{impuesto_5},#{maximo_20},#{monto_afecto_20},#{impuesto_20}, #{maximo_35},#{monto_afecto_35},#{impuesto_35},#{maximo_45},#{monto_afecto_45},#{impuesto_45},#{maximo_46},#{monto_afecto_46},#{impuesto_46},#{total_monto_afecto})")
    void insert(Salary salary);


    @Select("select * from practica2.salary where idsalary in (select max(idsalary) from practica2.salary)")
    List<Salary> findSpecific();


}