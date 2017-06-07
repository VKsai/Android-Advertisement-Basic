package aws.cs4521.chris.android.backend;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Chris on 5/15/2017.
 * Note:  AD IS LOCATED HERE - CODE FOR THIS PARTICULAR APP IS:
 * ca-app-pub-2921709422212947~7810338119 (APP ID)
 * ca-app-pub-2921709422212947/1205401318 (AD UNIT ID)
 */

public class Account extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        return inflater.inflate(R.layout.account, container, false);
    }
}
