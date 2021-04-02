package ciekawszeZadaniaZKursu.kolejkaDoLekarza;


import java.util.PriorityQueue;

public class HospitalQueue {
    PriorityQueue<Patient> queue = new PriorityQueue<>(new PatientComparator());

    void addP(Patient patient){
        queue.add(patient);
        System.out.println("Dodano "+patient);
    }
    void count(){
        System.out.println("Ilość osób czekających w kolejce: "+queue.size());
    }
    void showQueue(){
        System.out.println("Osoby czekające w kolejce: "+queue);
    }

    Patient nextPatient() {
        return queue.remove();
    }
}
