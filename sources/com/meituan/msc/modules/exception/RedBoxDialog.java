package com.meituan.msc.modules.exception;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.hhmedic.android.sdk.base.net.HHNetConfig;
import com.meituan.msc.devsupport.b;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RedBoxDialog extends Dialog implements AdapterView.OnItemClickListener {
    public static ChangeQuickRedirect a;
    protected ListView b;
    private final com.meituan.msc.devsupport.a c;
    private Button d;
    private Button e;
    @Nullable
    private Button f;
    @Nullable
    private TextView g;
    @Nullable
    private ProgressBar h;
    @Nullable
    private View i;
    private boolean j;
    private b.a k;
    private View.OnClickListener l;

    public static /* synthetic */ boolean a(RedBoxDialog redBoxDialog, boolean z) {
        redBoxDialog.j = true;
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends BaseAdapter {
        public static ChangeQuickRedirect a;
        private final String b;
        private final com.meituan.msc.devsupport.interfaces.a[] c;

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            return i > 0;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes3.dex */
        static class a {
            public static ChangeQuickRedirect a;
            final TextView b;
            final TextView c;

            private a(View view) {
                Object[] objArr = {view};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70fa38b44b31bc6436be78669e1eff17", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70fa38b44b31bc6436be78669e1eff17");
                    return;
                }
                this.b = (TextView) view.findViewById(R.id.rn_frame_method);
                this.c = (TextView) view.findViewById(R.id.rn_frame_file);
            }
        }

        public b(String str, com.meituan.msc.devsupport.interfaces.a[] aVarArr) {
            Object[] objArr = {str, aVarArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6301bf6ef0b44a5f2bae9a20558b4794", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6301bf6ef0b44a5f2bae9a20558b4794");
                return;
            }
            this.b = str;
            this.c = aVarArr;
            com.facebook.infer.annotation.a.a(this.b);
            com.facebook.infer.annotation.a.a(this.c);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return this.c.length + 1;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cb1d647831a3bae45cb51c5f3f81492", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cb1d647831a3bae45cb51c5f3f81492") : i == 0 ? this.b : this.c[i - 1];
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            TextView textView;
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15a1cb90c645a288b81c4f229507dd0d", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15a1cb90c645a288b81c4f229507dd0d");
            }
            if (i == 0) {
                if (view != null) {
                    textView = (TextView) view;
                } else {
                    textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.msc_redbox_item_title, viewGroup, false);
                }
                textView.setText((this.b == null ? "<unknown title>" : this.b).replaceAll("\\x1b\\[[0-9;]*m", ""));
                return textView;
            }
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.msc_redbox_item_frame, viewGroup, false);
                view.setTag(new a(view));
            }
            com.meituan.msc.devsupport.interfaces.a aVar = this.c[i - 1];
            a aVar2 = (a) view.getTag();
            aVar2.b.setText(aVar.b());
            aVar2.c.setText(e.a(aVar));
            aVar2.b.setTextColor(aVar.f() ? -5592406 : -1);
            aVar2.c.setTextColor(aVar.f() ? -8355712 : -5000269);
            return view;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a extends AsyncTask<com.meituan.msc.devsupport.interfaces.a, Void, Void> {
        public static ChangeQuickRedirect a;
        private static final MediaType b = MediaType.parse(HHNetConfig.JSON);

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(com.meituan.msc.devsupport.interfaces.a... aVarArr) {
            char c = 0;
            Object[] objArr = {aVarArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "347caf6444ae9a36abcf24a7c112d586", RobustBitConfig.DEFAULT_VALUE)) {
                return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "347caf6444ae9a36abcf24a7c112d586");
            }
            try {
                String uri = Uri.parse("").buildUpon().path("/open-stack-frame").query(null).build().toString();
                OkHttpClient okHttpClient = new OkHttpClient();
                int length = aVarArr.length;
                int i = 0;
                while (i < length) {
                    com.meituan.msc.devsupport.interfaces.a aVar = aVarArr[i];
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = aVar;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    okHttpClient.newCall(new Request.Builder().url(uri).post(RequestBody.create(b, (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e8dc80d9cfd0c56ba790863f0b65bdc0", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e8dc80d9cfd0c56ba790863f0b65bdc0") : new JSONObject(com.meituan.msc.jse.common.a.a("file", aVar.a(), "methodName", aVar.b(), "lineNumber", Integer.valueOf(aVar.c()), "column", Integer.valueOf(aVar.d())))).toString())).build()).execute();
                    i++;
                    c = 0;
                }
            } catch (Exception e) {
                g.b("ReactNative", e, "Could not open stack frame");
            }
            return null;
        }
    }

    public RedBoxDialog(Context context, @Nullable com.meituan.msc.devsupport.b bVar) {
        super(context, 2131558726);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c39cc00747703477c5bf3d71187fcbce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c39cc00747703477c5bf3d71187fcbce");
            return;
        }
        this.j = false;
        this.k = new b.a() { // from class: com.meituan.msc.modules.exception.RedBoxDialog.1
        };
        this.l = new View.OnClickListener() { // from class: com.meituan.msc.modules.exception.RedBoxDialog.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb03d177c9c30ff0bb125bf6ce8ca0de", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb03d177c9c30ff0bb125bf6ce8ca0de");
                    return;
                }
                RedBoxDialog.a(RedBoxDialog.this, true);
                ((TextView) com.facebook.infer.annotation.a.a(RedBoxDialog.this.g)).setText("Reporting...");
                ((TextView) com.facebook.infer.annotation.a.a(RedBoxDialog.this.g)).setVisibility(0);
                ((ProgressBar) com.facebook.infer.annotation.a.a(RedBoxDialog.this.h)).setVisibility(0);
                ((View) com.facebook.infer.annotation.a.a(RedBoxDialog.this.i)).setVisibility(0);
                ((Button) com.facebook.infer.annotation.a.a(RedBoxDialog.this.f)).setEnabled(false);
            }
        };
        requestWindowFeature(1);
        setContentView(R.layout.msc_redbox_view);
        this.c = new com.meituan.msc.devsupport.a();
        this.b = (ListView) findViewById(R.id.rn_redbox_stack);
        this.b.setOnItemClickListener(this);
        this.d = (Button) findViewById(R.id.rn_redbox_reload_button);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msc.modules.exception.RedBoxDialog.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "747ad4a9ba530fb18454a012c93e55e2", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "747ad4a9ba530fb18454a012c93e55e2");
                }
            }
        });
        this.e = (Button) findViewById(R.id.rn_redbox_dismiss_button);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msc.modules.exception.RedBoxDialog.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ba72b866c35fce510c422f054556d4e", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ba72b866c35fce510c422f054556d4e");
                } else {
                    RedBoxDialog.this.dismiss();
                }
            }
        });
    }

    public final void a(String str, com.meituan.msc.devsupport.interfaces.a[] aVarArr) {
        Object[] objArr = {str, aVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3d116a60355f0639ab2c2d68356720b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3d116a60355f0639ab2c2d68356720b");
        } else {
            this.b.setAdapter((ListAdapter) new b(str, aVarArr));
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object[] objArr = {adapterView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f652a8ae3fe8137b16be3960c059c52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f652a8ae3fe8137b16be3960c059c52");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(new a(), com.sankuai.android.jarvis.c.a(), (com.meituan.msc.devsupport.interfaces.a) this.b.getAdapter().getItem(i));
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "288ed66422d29f007ac472368e66f491", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "288ed66422d29f007ac472368e66f491")).booleanValue();
        }
        if (i == 82) {
            return true;
        }
        final com.meituan.msc.devsupport.a aVar = this.c;
        View currentFocus = getCurrentFocus();
        Object[] objArr2 = {Integer.valueOf(i), currentFocus};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.devsupport.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0c57d659f5e55e83779176f26dd8cef3", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0c57d659f5e55e83779176f26dd8cef3")).booleanValue();
        } else if (i == 46 && !(currentFocus instanceof EditText)) {
            if (aVar.b) {
                aVar.b = false;
            } else {
                aVar.b = true;
                new Handler().postDelayed(new Runnable() { // from class: com.meituan.msc.devsupport.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a8c65d3df63b2dd28762ebc7e39236ce", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a8c65d3df63b2dd28762ebc7e39236ce");
                        } else {
                            aVar.b = false;
                        }
                    }
                }, 200L);
            }
        }
        return super.onKeyUp(i, keyEvent);
    }
}
