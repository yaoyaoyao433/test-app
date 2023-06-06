package com.sankuai.waimai.bussiness.order.confirm.submit;

import android.content.DialogInterface;
import com.sankuai.waimai.bussiness.order.confirm.model.PreviewSubmitModel;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface b {
    void a();

    void a(int i);

    void a(int i, boolean z);

    void a(PreviewSubmitModel.ExtraParam extraParam);

    void a(BaseResponse baseResponse);

    void a(BaseResponse baseResponse, double d);

    void a(BaseResponse baseResponse, DialogInterface dialogInterface);

    void a(JSONObject jSONObject);

    void a(boolean z);

    void b();

    void b(int i);

    void b(PreviewSubmitModel.ExtraParam extraParam);

    void b(BaseResponse baseResponse);

    void c();

    void c(int i);

    void c(BaseResponse baseResponse);

    void d();

    void e();

    void f();

    void g();

    void h();

    void i();

    String j();
}
