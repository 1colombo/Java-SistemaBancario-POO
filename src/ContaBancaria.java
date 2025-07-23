public class ContaBancaria {
  private double saldo =0;
  private double limitCheque = 0;
  private double valorCheque = 0;
  private boolean verifyChequeEspecial;

  public ContaBancaria(double saldoInicial){
    this.saldo = saldoInicial;
    if(saldoInicial<=500){
      this.limitCheque = 50;
    } else if(saldoInicial>500){
      this.limitCheque = (0.50*saldoInicial);
    }
    verifyChequeEspecial = false;
  }

  public double getSaldo(){ //Consultar Saldo
    return saldo;
  }

  public double getLimitCheque(){ //Consultar Limite
    return this.limitCheque;
  }

  public boolean isChequeEspecialAtivado(){ //Verificar se usou ChequeEspecial
    return this.verifyChequeEspecial;
  }

  public void depositarDinheiro(double valor){ //Depositar
    if(valor>0){
      this.saldo += valor;  
    }else{
      System.out.println("Insira um valor positivo!\n");
    }
  }

  public boolean sacarDinheiro(double valor){ //Sacar
    if(valor<0){
      System.out.println("Saque Invalido\n");
      return false;
    }

    double saldoTotal = this.saldo + this.limitCheque;

    if(valor>saldoTotal){
      System.out.println("Saldo Insuficiente mesmo com o cheque especial!\n");
      return false;
    } else {
      if(valor>this.saldo){  
      double valorSacadoCheque = valor - this.saldo;
      this.valorCheque += valorSacadoCheque;
      verifyChequeEspecial = true;
      System.out.printf("Cheque utilizado no valor de R$%.2f\n", valorSacadoCheque);
    }
    this.saldo -= valor;
    System.out.printf("Total Sacado: R$%.2f -> Total na conta: R$%.2f\n",valor, this.saldo);

    if(verifyChequeEspecial == true && this.saldo<0){
      taxaCheque();
    }
  }
  return true;
}

  public void taxaCheque(){ //Função para calculcar Taxa
    if(this.verifyChequeEspecial && this.valorCheque>0){
      double taxa = this.valorCheque*0.20;
      System.out.printf("Valor da taxa por usar o cheque especial: R$%.2f\n", taxa);
      this.saldo -= taxa;
      this.valorCheque = 0;
      this.verifyChequeEspecial = false;
      System.out.printf("Saldo atual: R$%.2f\n", this.saldo);
    }
  }

  public boolean pagarBoleto(double valorBoleto){
    System.out.printf("Pagando boleto no valor de R$%.2f\n", valorBoleto);
    return sacarDinheiro(valorBoleto);
  }
}