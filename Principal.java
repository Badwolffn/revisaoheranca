public class Principal {
    public static void main(String[] args){
        Empregado empregado = new Empregado();
        empregado.setNome("Amabile");
        empregado.setEndereco("Pompeia");
        empregado.setTelefone("ZZZ");
        empregado.getSalario(1800);

        Empregado empregado2=new Empregado();    
        System.out.println(empregado.getNome());
        System.out.println(empregado.getEndereco());
        System.out.println(empregado.getTelefone());
        System.out.println(empregado.getSalario());
        Empregado empregado=new Empregado();
        //settar os dados
        empregado2.setNome("Lucas");
        empregado2.setEndereco("Marilia");
        empregado2.setTelefone("14997227277");
        empregado2.setSalario(9999);
        System.out.println(empregado2.getNome());
        System.out.println(empregado2.getEndereco());
        System.out.println(empregado2.getTelefone());
        System.out.println(empregado2.getSalario());

    }
}
