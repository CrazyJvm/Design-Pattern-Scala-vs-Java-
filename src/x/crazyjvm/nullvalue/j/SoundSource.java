package x.crazyjvm.nullvalue.j;

/**
 * Created by chenchao on 15/10/13.
 */
public class SoundSource {

    public static Sound getSound() {
        //return available ? music : new NullSound();
        return null;
    }

    public static void main(String[] args) {
        SoundSource.getSound().play();
    }
}
