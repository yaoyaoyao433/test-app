package com.meituan.msi.api.dialog;

import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class ActionSheetParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String alertText;
    public String itemColor = DiagnoseLog.COLOR_ERROR;
    public List<String> itemList;
}
