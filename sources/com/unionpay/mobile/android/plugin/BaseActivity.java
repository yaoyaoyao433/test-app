package com.unionpay.mobile.android.plugin;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.nfc.NfcAdapter;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcF;
import android.nfc.tech.NfcV;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.unionpay.mobile.android.nocard.utils.UPPayEngine;
import com.unionpay.mobile.android.nocard.views.l;
import com.unionpay.mobile.android.utils.k;
import com.unionpay.mobile.android.widgets.m;
import java.util.ArrayList;
/* loaded from: classes6.dex */
public abstract class BaseActivity extends Activity implements com.unionpay.mobile.android.plugin.a, b {
    public static IntentFilter[] FILTERS;
    public static String[][] TECHLISTS;
    private static int f;
    protected NfcAdapter c;
    private PendingIntent g;
    protected ArrayList<com.unionpay.mobile.android.nocard.views.b> b = null;
    private l a = null;
    private a d = null;
    private m e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public final class a {
        public com.unionpay.mobile.android.model.b a;
        public UPPayEngine b;

        public a(UPPayEngine uPPayEngine) {
            this.a = null;
            this.b = null;
            this.a = new com.unionpay.mobile.android.model.b();
            this.b = uPPayEngine;
            this.b.a(this.a);
        }
    }

    static {
        try {
            TECHLISTS = new String[][]{new String[]{IsoDep.class.getName()}, new String[]{NfcV.class.getName()}, new String[]{NfcF.class.getName()}};
            FILTERS = new IntentFilter[]{new IntentFilter("android.nfc.action.TECH_DISCOVERED", "*/*")};
        } catch (Exception unused) {
        }
    }

    public Object a(String str) {
        if (str == null) {
            return this.d.a;
        }
        if (str.equalsIgnoreCase(UPPayEngine.class.toString())) {
            return this.d.b;
        }
        if (str.equalsIgnoreCase(m.class.toString())) {
            return this.e;
        }
        return null;
    }

    public final void a(int i) {
        if (this.b != null) {
            int size = this.b.size() - 1;
            this.b.get(size);
            while (size >= 0) {
                com.unionpay.mobile.android.nocard.views.b bVar = this.b.get(size);
                if (bVar.g() == i) {
                    setContentView(bVar);
                    return;
                } else {
                    this.b.remove(size);
                    size--;
                }
            }
        }
    }

    public final void a(com.unionpay.mobile.android.nocard.views.b bVar) {
        if (this.b != null) {
            int size = this.b.size();
            if (size > 0) {
                this.b.get(size - 1);
            }
            this.b.add(bVar);
            setContentView(bVar);
        }
    }

    public boolean a() {
        return false;
    }

    public final void b() {
        int size;
        if (this.b == null || (size = this.b.size()) <= 0) {
            return;
        }
        int i = size - 1;
        this.b.get(i);
        this.b.get(i);
        this.b.remove(i);
        if (this.b.size() != 0) {
            this.b.get(this.b.size() - 1);
            setContentView(this.b.get(this.b.size() - 1));
        }
    }

    public final String c() {
        return this.d.a.a;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        try {
            Resources resources = super.getResources();
            Configuration configuration = new Configuration();
            configuration.setToDefaults();
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            return resources;
        } catch (Exception unused) {
            return super.getResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        com.meituan.android.privacy.aop.a.a();
        if (this.a != null) {
            this.a.u();
        }
        super.onActivityResult(i, i2, intent);
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k.a("uppay", "PayActivityEx.onCreate() +++");
        com.unionpay.mobile.android.languages.c.a();
        com.unionpay.mobile.android.global.a.a(this);
        this.b = new ArrayList<>(1);
        this.d = new a(d());
        this.e = new m(this);
        requestWindowFeature(1);
        super.onCreate(bundle);
        this.a = (l) a(1, null);
        setContentView(this.a);
        getWindow().addFlags(8192);
        f++;
        k.a("uppay", "PayActivityEx.onCreate() ---");
        if (a()) {
            this.c = NfcAdapter.getDefaultAdapter(this);
            this.g = PendingIntent.getActivity(this, 0, new Intent(this, getClass()).addFlags(536870912), 0);
            onNewIntent(getIntent());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        if (this.b != null) {
            this.b.clear();
        }
        if (this.a != null) {
            this.a.x();
        }
        this.a = null;
        com.unionpay.mobile.android.model.b.bl = false;
        com.unionpay.mobile.android.model.b.bb = null;
        com.unionpay.mobile.android.model.b.bm = false;
        int i = f - 1;
        f = i;
        if (i == 0) {
            com.unionpay.mobile.android.resource.c.a(this).a();
        }
        this.e.c();
        this.e = null;
        this.d.b = null;
        this.d.a = null;
        this.d = null;
        ((ViewGroup) getWindow().getDecorView().findViewById(16908290)).removeAllViews();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.b != null && this.b.size() > 0) {
                this.b.get(this.b.size() - 1).k();
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (!a() || this.c == null) {
            return;
        }
        this.c.disableForegroundDispatch(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.e.a()) {
            this.e.b();
        }
        if (!a() || this.c == null) {
            return;
        }
        this.c.enableForegroundDispatch(this, this.g, FILTERS, TECHLISTS);
    }
}
