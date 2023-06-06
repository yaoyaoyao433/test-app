package com.sankuai.network.debug;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.dianping.archive.DPObject;
import com.dianping.dataservice.d;
import com.dianping.dataservice.mapi.c;
import com.dianping.dataservice.mapi.e;
import com.dianping.dataservice.mapi.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TestMapiActivity extends Activity {
    public static ChangeQuickRedirect a;
    private TextView b;
    private EditText c;
    private Button d;
    private Spinner e;
    private Spinner f;
    private ArrayAdapter<String> g;
    private ArrayList<ArrayList<String>> h;
    private String i;
    private String j;

    public TestMapiActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9a0a55de6a805954cc9c770d3de5263", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9a0a55de6a805954cc9c770d3de5263");
        } else {
            this.h = new ArrayList<>();
        }
    }

    public static /* synthetic */ void a(TestMapiActivity testMapiActivity, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, testMapiActivity, changeQuickRedirect, false, "008e0aa87f1f8806352014929541ab3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, testMapiActivity, changeQuickRedirect, false, "008e0aa87f1f8806352014929541ab3d");
            return;
        }
        e a2 = testMapiActivity.j.equals("GET") ? com.dianping.dataservice.mapi.b.a(str, c.DISABLED) : null;
        if (testMapiActivity.j.equals("POST")) {
            a2 = com.dianping.dataservice.mapi.b.a(str, new String[0]);
        }
        com.sankuai.network.b.a(testMapiActivity).a().exec2(a2, (d) new d<e, f>() { // from class: com.sankuai.network.debug.TestMapiActivity.4
            public static ChangeQuickRedirect a;

            @Override // com.dianping.dataservice.d
            public final /* synthetic */ void onRequestFailed(e eVar, f fVar) {
                e eVar2 = eVar;
                f fVar2 = fVar;
                Object[] objArr2 = {eVar2, fVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5293900dfc567403e687307a7d3ab3ec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5293900dfc567403e687307a7d3ab3ec");
                } else {
                    TestMapiActivity.this.a(eVar2, fVar2);
                }
            }

            @Override // com.dianping.dataservice.d
            public final /* synthetic */ void onRequestFinish(e eVar, f fVar) {
                e eVar2 = eVar;
                f fVar2 = fVar;
                Object[] objArr2 = {eVar2, fVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d26980484c5fd8c160e4a4d46e2cda99", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d26980484c5fd8c160e4a4d46e2cda99");
                } else {
                    TestMapiActivity.this.a(eVar2, fVar2);
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc5ad5a0dd4aec3f6cef910a374e734c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc5ad5a0dd4aec3f6cef910a374e734c");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.sk_network_debug_test_mapi);
        this.b = (TextView) findViewById(R.id.response_text);
        this.c = (EditText) findViewById(R.id.view_url_sk_network_input);
        this.d = (Button) findViewById(R.id.view_url);
        this.e = (Spinner) findViewById(R.id.spinner);
        this.f = (Spinner) findViewById(R.id.spinner2);
        this.h.add(new ArrayList<>(Arrays.asList("Mapi", "Http")));
        this.h.add(new ArrayList<>(Arrays.asList("GET", "POST")));
        this.g = new ArrayAdapter<>(this, 17367048, this.h.get(0));
        this.g.setDropDownViewResource(17367049);
        this.e.setAdapter((SpinnerAdapter) this.g);
        this.g = new ArrayAdapter<>(this, 17367048, this.h.get(1));
        this.g.setDropDownViewResource(17367049);
        this.f.setAdapter((SpinnerAdapter) this.g);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.network.debug.TestMapiActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "708a1082676bf346df4b20a9e5aa38d8", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "708a1082676bf346df4b20a9e5aa38d8");
                } else {
                    TestMapiActivity.a(TestMapiActivity.this, TestMapiActivity.this.c.getText().toString());
                }
            }
        });
        this.e.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.sankuai.network.debug.TestMapiActivity.2
            public static ChangeQuickRedirect a;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                Object[] objArr2 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ab3d89b54f268086d89efebcd3af225", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ab3d89b54f268086d89efebcd3af225");
                    return;
                }
                TestMapiActivity.this.i = (String) ((ArrayList) TestMapiActivity.this.h.get(0)).get(i);
                adapterView.setVisibility(0);
                if (TestMapiActivity.this.i.equals("Mapi")) {
                    TestMapiActivity.this.c.clearComposingText();
                    TestMapiActivity.this.c.setText("http://m.api.dianping.com/tunneltest.bin?content=11&status=201");
                }
                if (TestMapiActivity.this.i.equals("Http")) {
                    TestMapiActivity.this.c.clearComposingText();
                    TestMapiActivity.this.c.setText("http://app.t.dianping.com/demothrift.bin?dids=34594351");
                }
            }
        });
        this.f.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.sankuai.network.debug.TestMapiActivity.3
            public static ChangeQuickRedirect a;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                Object[] objArr2 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06160eaf4da42502fe6443b49b69fa70", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06160eaf4da42502fe6443b49b69fa70");
                    return;
                }
                TestMapiActivity.this.j = (String) ((ArrayList) TestMapiActivity.this.h.get(1)).get(i);
                adapterView.setVisibility(0);
            }
        });
    }

    public final void a(e eVar, f fVar) {
        String str;
        Object[] objArr = {eVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01d7c0403e0016eb1e292a5585bba7b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01d7c0403e0016eb1e292a5585bba7b6");
            return;
        }
        StringBuilder sb = new StringBuilder();
        Object a2 = fVar.a();
        String str2 = null;
        if (fVar instanceof com.dianping.dataservice.http.impl.b) {
            com.dianping.dataservice.http.impl.b bVar = (com.dianping.dataservice.http.impl.b) fVar;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.dataservice.http.impl.b.c;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "0f67c3469022defcf9a8611438b8b826", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "0f67c3469022defcf9a8611438b8b826");
            } else {
                int i = bVar.d;
                if (i == 4) {
                    str = "wns";
                } else if (i != 8) {
                    switch (i) {
                        case 0:
                            str = "http";
                            break;
                        case 1:
                            str = "tunnel";
                            break;
                        case 2:
                            str = "utn";
                            break;
                        default:
                            str = CommonConstant.Symbol.QUESTION_MARK;
                            break;
                    }
                } else {
                    str = "https";
                }
            }
        } else {
            str = null;
        }
        if (a2 != null && (a2 instanceof DPObject)) {
            str2 = b.a((DPObject) a2);
        }
        sb.append("Type:");
        sb.append(eVar.b());
        sb.append('\n');
        sb.append("From:");
        sb.append(str);
        sb.append('\n');
        sb.append("StatusCode:");
        sb.append(String.valueOf(fVar.b()));
        sb.append('\n');
        sb.append("Response:");
        sb.append(str2);
        sb.append('\n');
        sb.append("Config:");
        if (a() != null) {
            sb.append(a().toString());
        }
        this.b.setText(sb.toString());
    }

    private JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5cac68dade8e3f60829b28312e39835", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5cac68dade8e3f60829b28312e39835");
        }
        File file = new File(getFilesDir().getAbsolutePath() + "/tunnel_config/1");
        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                if (fileInputStream.available() > 1000000) {
                    throw new IOException();
                }
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                return new JSONObject(new String(bArr, "UTF-8"));
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
