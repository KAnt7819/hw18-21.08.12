package org.example;

import java.util.Date;

//2) Создайте класс пенсионный фонд, в нем создайте такие поля:
//
//а) Именование пенсионного фонда
//б) булеан переменная, явлется ли он государственным
//в) Дата создания
//г) количество участников фонда
//
//
//3) Добавьте сетеры и гетеры этому классу, заблокируйте прямой доступ к переменным.
//
//
//4) Добавьте метод "info" - выводит информацию по фонду. Если фонд государственный,
// то информация должна содержать строку о том, сколько ТЫСЯЧ человек используют фонд.
// Для не-государственных - сколько человек используют фонд (не ТЫСЯЧ)
//
//
//5) Запретить менять дату создания фонда (отобрать сеттер)
public class PensionniFond {
    private String gosPens;
    private boolean isState;
    private Date creationDate;
    private int participantCount;

    public PensionniFond(String gosPens, boolean isState, Date creationData, int participantCount) {
        this.gosPens = gosPens;
        this.isState = isState;
        this.creationDate = creationDate;
        this.participantCount = participantCount;
    }

    public String getGosPens() {
        return gosPens;
    }

    public void setGosPens(String gosPens) {
        this.gosPens = gosPens;
    }

    public boolean isState() {
        return isState;
    }

    public void setState(boolean state) {
        isState = state;
    }

    public Date getCreationData() {
        return creationDate;
    }

//    public void setCreationData(Data creationData) {
//        this.creationData = creationData;
//    }

    public int getParticipantCount() {
        return participantCount;
    }

    public void setParticipantCount(int participantCount) {
        this.participantCount = participantCount;
    }

    public void info () {
        if (isState) {
            System.out.println("Государственный фонд используют :" + participantCount/1000 + " тысяч человек");
        }else System.out.println("Негосударственный фонд используют :" + participantCount + " человек");
    }
}
