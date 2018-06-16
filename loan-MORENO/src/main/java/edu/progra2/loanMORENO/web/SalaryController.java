package edu.progra2.loanMORENO.web;


import edu.progra2.loanMORENO.model.Salary;
import edu.progra2.loanMORENO.repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Controller
public class SalaryController {
    @Autowired
    private SalaryRepository salaryRepository;


    @GetMapping("/salary/new")
    public String initCreationForm(Model model) {
        model.addAttribute("salary", new Salary());
        return "FormSalary";
    }

    @PostMapping("/salary/new")
    public String submitForm(@Valid Salary salary,
                             BindingResult bindingResult) {
        if(bindingResult.hasFieldErrors()) {
            return "FormSalary";
        }

        System.out.print("llego aqui");
        double uit = 0;
        double salario = 0;
        double total = 0;
        double totalUit = 0;
        double rentaGrabable = 0;
        double val=0;
        double IR = 0;
        int calculo=0;
        int retencionMensual = 0;
        double totalNeta  = 0;
        uit = salary.getUit();

        double maximo_5 = 0;
        double monto_afecto_5 = 0;
        double impuesto_5 = 0 ;
        double maximo_20 = 0;
        double monto_afecto_20 = 0;
        double impuesto_20 = 0;
        double maximo_35 = 0;
        double monto_afecto_35 =0 ;
        double impuesto_35 = 0;
        double maximo_45 = 0;
        double monto_afecto_45 = 0;
        double impuesto_45 =0;
        String maximo_46 = "";
        double monto_afecto_46 = 0;
        double impuesto_46 = 0;
        double total_monto_afecto =0;
        salario = salary.getSueldo();
        String tipo = salary.getTipo();
        if (tipo=="Dependiente"){
            total = (float) salario * 12;
        }else {
            total = (float)( total + (salario *14));
        }

        totalUit = uit*7;


        if (total >= totalUit){
            rentaGrabable = total - totalUit;
            calculo = (int) Math.round(rentaGrabable/uit);

            if (calculo > 45){
                IR = (float) ((uit*5*0.08) + (uit*15*0.14) + (uit*15*0.17)+(uit*10*0.2)+ ((rentaGrabable-(uit*45))*0.3));

                  maximo_5 = uit*5;
                  monto_afecto_5 = uit*5;
                  impuesto_5 = uit*5*0.08 ;
                  maximo_20 = uit*20;
                  monto_afecto_20 = uit*15;
                  impuesto_20 = uit*15*0.14;
                  maximo_35 = uit*35;
                  monto_afecto_35 =uit*15 ;
                  impuesto_35 = uit*15*0.17;
                  maximo_45 = uit * 45;
                  monto_afecto_45 = uit*10;
                  impuesto_45 = uit*10*0.2;
                  maximo_46 = ">" + (uit*45);
                  monto_afecto_46 = rentaGrabable-(uit*45);
                  impuesto_46 =  (rentaGrabable-(uit*45))*0.3;
                  total_monto_afecto = monto_afecto_5 + monto_afecto_20 +monto_afecto_35 +monto_afecto_45 +monto_afecto_46;

            }else{
                if (calculo > 35){
                    IR = (float) ((uit*5*0.08) + (uit*15*0.14) + (uit*15*0.17)+ ((rentaGrabable-(uit*35))*0.2));
                    maximo_5 = uit*5;
                    monto_afecto_5 = uit*5;
                    impuesto_5 = uit*5*0.08 ;
                    maximo_20 = uit*20;
                    monto_afecto_20 = uit*15;
                    impuesto_20 = uit*15*0.14;
                    maximo_35 = uit*35;
                    monto_afecto_35 =uit*15 ;
                    impuesto_35 = uit*15*0.17;
                    maximo_45 = uit * 45;
                    monto_afecto_45 = rentaGrabable-(uit*35);
                    impuesto_45 = (rentaGrabable-(uit*35))*0.2;
                    maximo_46 = ">" + (uit*45);
                    total_monto_afecto = monto_afecto_5 + monto_afecto_20 +monto_afecto_35 +monto_afecto_45;
                }else{
                    if (calculo > 20) {
                        IR = (float) ((uit * 5 * 0.08) + (uit * 15 * 0.14) + ((rentaGrabable - (uit * 20)) * 0.17));
                        maximo_5 = uit*5;
                        monto_afecto_5 = uit*5;
                        impuesto_5 = uit*5*0.08 ;
                        maximo_20 = uit*20;
                        monto_afecto_20 = uit*15;
                        impuesto_20 = uit*15*0.14;
                        maximo_35 = uit*35;
                        monto_afecto_35 =rentaGrabable - (uit * 20) ;
                        impuesto_35 = (rentaGrabable - (uit * 20)) * 0.17;
                        maximo_45 = uit * 45;
                        maximo_46 = ">" + (uit*45);
                        total_monto_afecto = monto_afecto_5 + monto_afecto_20 +monto_afecto_35 ;

                    }else{
                        if (calculo > 5) {
                            IR = (float) ((uit * 5 * 0.08) +  ((rentaGrabable - (uit * 5)) * 0.14));
                            maximo_5 = uit*5;
                            monto_afecto_5 = uit*5;
                            impuesto_5 = uit*5*0.08 ;
                            maximo_20 = uit*20;
                            monto_afecto_20 = rentaGrabable - (uit * 5);
                            impuesto_20 = (rentaGrabable - (uit * 5)) * 0.14;
                            maximo_35 = uit*35;
                            maximo_45 = uit * 45;
                            maximo_46 = ">" + (uit*45);
                            total_monto_afecto = monto_afecto_5 + monto_afecto_20  ;
                        }else{
                            IR = (float) (rentaGrabable * 0.08);
                            maximo_5 = uit*5;
                            monto_afecto_5 = rentaGrabable;
                            impuesto_5 = rentaGrabable * 0.08 ;
                            maximo_20 = uit*20;
                            maximo_35 = uit*35;
                            maximo_45 = uit * 45;
                            maximo_46 = ">" + (uit*45);
                            total_monto_afecto = monto_afecto_5 + monto_afecto_20  ;
                        }
                    }
                }
            }

        }else{

            IR=0;
        }
        totalNeta = total- IR;

        
        retencionMensual =(int) Math.round(IR /12);
        salary.setTotal_bruto(total);
        salary.setTotal_impuesto(IR);
        salary.setTotal_neta(totalNeta);
        salary.setRetencion_mensual(retencionMensual);
        salary.setMaximo_5(maximo_5);
        salary.setMonto_afecto_5(monto_afecto_5);
        salary.setImpuesto_5(impuesto_5);
        salary.setMaximo_20(maximo_20);
        salary.setMonto_afecto_20(monto_afecto_20);
        salary.setImpuesto_20(impuesto_20);
        salary.setMaximo_35(maximo_35);
        salary.setMonto_afecto_35(monto_afecto_35);
        salary.setImpuesto_35(impuesto_35);
        salary.setMaximo_45(maximo_45);
        salary.setMonto_afecto_45(monto_afecto_45);
        salary.setImpuesto_45(impuesto_45);
        salary.setMaximo_46(maximo_46);
        salary.setMonto_afecto_46(monto_afecto_46);
        salary.setImpuesto_46(impuesto_46);
        salary.setTotal_monto_afecto(total_monto_afecto);
        salary.setDescontable_uit(totalUit);
        salary.setRenta_grabable(rentaGrabable);
        salaryRepository.insert(salary);
        return "proyeccion";
    }


    @GetMapping("/salary/list")
    public String list(Map<String, Object> model) {
        List<Salary> salary =salaryRepository.findAll();
        model.put("salary", salary);
        return "listLoan";
    }



}
