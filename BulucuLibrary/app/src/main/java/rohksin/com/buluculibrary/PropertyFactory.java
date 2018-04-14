package rohksin.com.buluculibrary;

import android.net.wifi.ScanResult;

/**
 * Created by Illuminati on 4/14/2018.
 */

public class PropertyFactory {

    public String propType;
    private ScanResult scanResult;

    public static final String CONSICE ="Type1";



    public BulucuProps getBulucuProp(String propType, ScanResult scanResult)
    {
        this.propType = propType;
        this.scanResult = scanResult;
        return  getProp(propType);
    }
    
    private BulucuProps getProp(String propType)
    {
        if(propType.equals("consice"))
        {
            BulucuProps props = new BulucuProps();
            props.setSsid(scanResult.SSID);

            return props;
        }
        return null;
    }

}
