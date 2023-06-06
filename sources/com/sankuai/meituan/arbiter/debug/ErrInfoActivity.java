package com.sankuai.meituan.arbiter.debug;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.ScrollView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.arbiter.hook.Utils;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ErrInfoActivity extends Activity {
    public static ChangeQuickRedirect a;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f20de372bdb9687b786b6392f077e9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f20de372bdb9687b786b6392f077e9f");
            return;
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        ScrollView scrollView = new ScrollView(this);
        TextView textView = new TextView(this);
        textView.append(Html.fromHtml("<b>Intent</b><br/>" + f.a(intent, Utils.INTENT_KEY_INTENT) + "<br/><b>Stack Trace</b><br/>" + f.a(intent, Utils.INTENT_KEY_TRACE)));
        textView.setTextIsSelectable(true);
        textView.setPadding(60, 20, 60, 20);
        textView.setTextSize(2, 16.0f);
        scrollView.addView(textView);
        setContentView(scrollView);
    }
}
