package com.sankuai.waimai.store.i.poi;

import android.content.Context;
import android.content.Intent;
import com.sankuai.waimai.store.base.SCBaseActivity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface PoiDrugService {
    public static final String KEY_DRUG = "poi_communication_drug";

    Intent getDrugHomeActivityIntent(Context context);

    boolean isDrugReversion(SCBaseActivity sCBaseActivity);

    void onDrugHomeTabChanged(int i, boolean z);
}
