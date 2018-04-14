package rohksin.com.buluculibrary;

import android.net.wifi.ScanResult;

import java.util.List;

/**
 * Created by Illuminati on 4/14/2018.
 */

public interface Bulucu {


    public List<ScanResult> getScanList();

    public String getProps(ScanResult scanResult);

    public boolean connect();

}
