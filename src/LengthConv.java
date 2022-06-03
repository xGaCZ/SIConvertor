import java.util.ArrayList;

public class LengthConv
{
    float[] value={1000,10,10,10,0.0001f,0.10f,};//first KM to M[0] to DM[1] to CM[2] to MM[3]

    void convertKM(float length)
    {
        System.out.println(length+" kilometrów to: "+value[0]*length+ " metrów");
        System.out.println(length+" kilometrów to: "+value[0]*value[1]*length+ " decymetrów");
        System.out.println(length+" kilometrów to: "+value[0]*value[1]*value[2]*length+ " centymetrów");
        System.out.println(length+" kilometrów to: "+value[0]*value[1]*value[2]*value[3]*length+ " milimetrów");
    }
    void convertM(float length)
    {
        System.out.println(length+" metrów to: "+value[4]*length+ " kilometrów");
        System.out.println(length+" metrów to: "+value[2]*length+ " decymetrów");
    }



}
