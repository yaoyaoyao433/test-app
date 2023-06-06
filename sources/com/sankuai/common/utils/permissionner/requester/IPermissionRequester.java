package com.sankuai.common.utils.permissionner.requester;

import android.app.Activity;
import android.content.Context;
import com.sankuai.common.utils.permissionner.dialog.IDialogProxy;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface IPermissionRequester {
    int checkSelfPermission(String str);

    Activity getActivity();

    Context getContext();

    void requestPermissions(String[] strArr, int i);

    boolean shouldShowRequestPermissionRationale(String str);

    IDialogProxy showDialog(ArrayList<String> arrayList);
}
