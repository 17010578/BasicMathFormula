package sg.edu.rp.c346.basicmathformula;

/**
 * Created by 17010578 on 18/7/2018.
 */
public class Math {

    private String area;
    private String form;
    private String last;




    public Math(String area, String form ,String last) {
        this.area = area;
        this.form = form;
        this.last = last;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "Math{" +
                "area='" + area + '\'' +
                ", form='" + form + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}

