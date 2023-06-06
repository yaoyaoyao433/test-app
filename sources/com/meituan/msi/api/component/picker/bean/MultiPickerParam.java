package com.meituan.msi.api.component.picker.bean;

import com.google.gson.JsonElement;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class MultiPickerParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<List<JsonElement>> array;
    public String arrayKey;
    public List<Integer> current;
}
