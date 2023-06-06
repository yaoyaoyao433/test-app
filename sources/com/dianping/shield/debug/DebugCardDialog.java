package com.dianping.shield.debug;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DebugCardDialog extends Activity {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fde89866f078d1fa765505c815481c40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fde89866f078d1fa765505c815481c40");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.shield_debug_dialog_view);
        findViewById(R.id.node_view).setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugCardDialog.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "20d751e912023b8387cbaf6b0e72aeae", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "20d751e912023b8387cbaf6b0e72aeae");
                } else {
                    DebugCardDialog.this.jumpToDebugPannel("com.dianping.shield.debugpanel.nodelist");
                }
            }
        });
        findViewById(R.id.whiteboard_view).setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugCardDialog.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e7357b581b2a965da22f526f262e1684", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e7357b581b2a965da22f526f262e1684");
                } else {
                    DebugCardDialog.this.jumpToDebugPannel("com.dianping.shield.debugpanel.whiteboard");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jumpToDebugPannel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "401d8b3f40c6b45bf4f2808f2d6a5cb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "401d8b3f40c6b45bf4f2808f2d6a5cb3");
            return;
        }
        Intent intent = new Intent(str);
        intent.setPackage(getPackageName());
        startActivity(intent);
        finish();
    }
}
