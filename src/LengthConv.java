import java.util.ArrayList;

public class LengthConv
{
    float[] value={1000,10,0.001f,0.1f,};

    void convertKM(float length)
    {
        System.out.println(length+" kilometrów to: "+value[0]*length+ " metrów");
        System.out.println(length+" kilometrów to: "+value[0]*value[1]*length+ " decymetrów");
        System.out.println(length+" kilometrów to: "+value[0]*value[1]*value[1]*length+ " centymetrów");
        System.out.println(length+" kilometrów to: "+value[0]*value[1]*value[1]*value[1]*length+ " milimetrów");
    }
    void convertM(float length)
    {
        System.out.println(length+" metrów to: "+value[2]*length+ " kilometrów");
        System.out.println(length+" metrów to: "+value[1]*length+ " decymetrów");
        System.out.println(length+" metrów to: "+value[1]*value[1]*length+ " centymetrów");
        System.out.println(length+" metrów to: "+value[1]*value[1]*value[1]*length+ " milimetrów");
    }
    void convertDM(float length)
    {
        System.out.println(length+" decymetrów to: "+value[2]*value[3]*length+ " kilometrów");
        System.out.println(length+" decymetrów to: "+value[3]*length+ " metrów");
        System.out.println(length+" decymetrów to: "+value[1]*length+ " centymetrów");
        System.out.println(length+" decymetrów to: "+value[1]*value[1]*length+ " milimetrów");
    }
    void convertCM(float length)
    {
        System.out.println(length+" centymetrów to: "+value[2]*value[3]*value[3]*length+ " kilometrów");
        System.out.println(length+" centymetrów to: "+value[3]*value[3]*length+ " metrów");
        System.out.println(length+" centymetrów to: "+value[3]*length+ " decymetrów");
        System.out.println(length+" centymetrów to: "+value[1]*length+ " milimetrów");
    }
    void convertMM(float length)
    {
        System.out.println(length+" milimetry to: "+value[2]*value[2]*length+ " kilometrów");
        System.out.println(length+" milimetry to: "+value[2]*length+ " metrów");
        System.out.println(length+" milimetry to: "+value[3]*value[3]*length+ " decymetrów");
        System.out.println(length+" milimetry to: "+value[3]*length+ " centymetrów");
    }



}
