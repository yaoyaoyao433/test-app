package com.sankuai.network.debug;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.dianping.networklog.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.l;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LoganTestActivity extends Activity {
    public static ChangeQuickRedirect a;
    private ListView b;
    private List<b> c;
    private SimpleDateFormat d;
    private a e;
    private String f;

    public LoganTestActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e41aaf809ff4d3ff783eef432e003ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e41aaf809ff4d3ff783eef432e003ec");
            return;
        }
        this.c = new LinkedList();
        this.d = new SimpleDateFormat("yyyy-MM-dd");
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "429e37f4a99c383b5e4cac5c569820d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "429e37f4a99c383b5e4cac5c569820d9");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.sk_network_debug_logan_panel);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94e1af9202df246b34112038994e523e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94e1af9202df246b34112038994e523e");
            return;
        }
        a();
        this.b = (ListView) findViewById(R.id.debug_logan_test);
        c.a(getApplicationContext());
        c.b();
        b();
    }

    private void a() {
        ContentResolver contentResolver;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "634597a944f5c78d8722bcf2342ac299", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "634597a944f5c78d8722bcf2342ac299");
            return;
        }
        Context applicationContext = getApplicationContext();
        if (getApplicationContext() == null || (contentResolver = applicationContext.getContentResolver()) == null) {
            return;
        }
        try {
            this.f = l.a(contentResolver, "android_id");
        } catch (Exception e) {
            e.printStackTrace();
            this.f = "12345";
        }
    }

    private void b() {
        String[] list;
        String[] split;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7770cfa4f1bf046b5b8de6c7552a209", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7770cfa4f1bf046b5b8de6c7552a209");
            return;
        }
        c.a(true);
        String f = c.f();
        if (!TextUtils.isEmpty(f)) {
            File file = new File(f);
            if (file.isDirectory() && (list = file.list()) != null) {
                for (String str : list) {
                    try {
                        if (!TextUtils.isEmpty(str) && (split = str.split("\\.")) != null && split.length == 1) {
                            b bVar = new b();
                            String a2 = a(split[0]);
                            if (!TextUtils.isEmpty(a2)) {
                                File file2 = new File(f, str);
                                if (file2.isFile()) {
                                    long length = file2.length() / 1024;
                                    if (length >= 0) {
                                        bVar.c = a2 + CommonConstant.Symbol.BRACKET_LEFT + length + "KB)";
                                    }
                                }
                                bVar.b = a2;
                                this.c.add(bVar);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.e = new a(getApplicationContext(), -1, this.c);
        this.b.setAdapter((ListAdapter) this.e);
        c.a(new c.a() { // from class: com.sankuai.network.debug.LoganTestActivity.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.networklog.c.a
            public final void onLisenterUploadLogStatus(String str2, int i) {
                Object[] objArr2 = {str2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dea99d9325d4b0bfc41004369b3825b0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dea99d9325d4b0bfc41004369b3825b0");
                    return;
                }
                for (b bVar2 : LoganTestActivity.this.c) {
                    if (str2.equals(bVar2.b)) {
                        if (i == -102) {
                            bVar2.a = 3;
                        } else if (i == -101) {
                            bVar2.a = 2;
                        } else if (i == -103) {
                            bVar2.a = 4;
                        } else if (i == -104) {
                            bVar2.a = 5;
                        }
                    }
                }
                LoganTestActivity.this.e.notifyDataSetChanged();
            }
        });
        this.b.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.network.debug.LoganTestActivity.2
            public static ChangeQuickRedirect a;

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                Object[] objArr2 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d32ac8cfe5e99be4ef763715246b36ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d32ac8cfe5e99be4ef763715246b36ba");
                } else {
                    c.a(new String[]{((b) LoganTestActivity.this.c.get(i)).b}, LoganTestActivity.this.f);
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "709eedad2ce9597bcfe15a11dff1952d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "709eedad2ce9597bcfe15a11dff1952d");
            return;
        }
        super.onDestroy();
        c.a((c.a) null);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends ArrayAdapter<b> {
        public static ChangeQuickRedirect a;
        private List<b> c;
        private LayoutInflater d;

        public a(Context context, int i, List<b> list) {
            super(context, -1);
            Object[] objArr = {LoganTestActivity.this, context, -1, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab6117c39eb9e0cc5124f1eaa9c23078", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab6117c39eb9e0cc5124f1eaa9c23078");
                return;
            }
            this.d = LayoutInflater.from(context);
            this.c = list;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "205235c21ccb190f4d2bd07699875829", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "205235c21ccb190f4d2bd07699875829")).intValue() : this.c.size();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0acaed35e5bea9fd1b015b1b7c49606e", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0acaed35e5bea9fd1b015b1b7c49606e");
            }
            if (view == null) {
                view = this.d.inflate(R.layout.sk_network_debug_item_logan_layout, (ViewGroup) null);
            }
            TextView textView = (TextView) view.findViewById(R.id.logan_date_tv);
            TextView textView2 = (TextView) view.findViewById(R.id.logan_status_tv);
            b bVar = this.c.get(i);
            switch (bVar.a) {
                case 1:
                    textView2.setText("正在进行");
                    break;
                case 2:
                    textView2.setText("回执成功");
                    break;
                case 3:
                    textView2.setText("回执失败");
                    break;
                case 4:
                    textView2.setText("上传成功");
                    break;
                case 5:
                    textView2.setText("上传失败");
                    break;
            }
            textView.setText(bVar.c);
            return view;
        }
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a4485207413a4b0356113375ff87d53", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a4485207413a4b0356113375ff87d53");
        }
        try {
            return this.d.format(new Date(Long.valueOf(str).longValue()));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class b {
        public int a;
        public String b;
        public String c;

        private b() {
            this.a = 0;
        }
    }
}
