public class PatientList {

    Node head = null;
    Node tail = null;
    int size = 0;


    public PatientList() {
        this.head = null;
    }

    public void addPatient(Patient data){

        Node newPatient = new Node(data);

        if (head == null) {
            head = newPatient;
            tail = newPatient;
            return;
        }
        else {
            tail.next = newPatient;
            newPatient = tail;
        }
        size++;
    }

    public void removePatient(int patientId){

        if (head == null) {
            System.out.println("Patient list is already empty");
        }
        else if (head.next == null){
            head = null;
            tail = null;
            System.out.println("Patient has been removed");
        }
        else if (head.data.patientId == patientId) {
            head = head.next;
        }

        Node prev = head;
        Node temp = head.next;

        while (temp != null){
            if (temp.data.patientId == patientId){
                prev.next = temp.next;
            }
            prev = temp;
            temp = temp.next;
        }

    }



}
