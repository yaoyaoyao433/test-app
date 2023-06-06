package com.sankuai.waimai.mach.render;

import android.os.AsyncTask;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.h;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class RendererAsyncTask extends AsyncTask<Void, Long, com.sankuai.waimai.mach.node.a> {
    private static final String TAG = "RendererAsyncTask";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map<String, Object> data;
    private final Mach mMach;
    private final RenderNodeTask mRenderTask;
    private final RenderViewTreeTask mRenderViewTask;
    private final Map<String, Object> value;

    public RendererAsyncTask(Mach mach, Map<String, Object> map, Map<String, Object> map2, int i, int i2, com.sankuai.waimai.mach.model.data.a aVar, h hVar) {
        Object[] objArr = {mach, map, map2, Integer.valueOf(i), Integer.valueOf(i2), aVar, hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76f302b4b9c3a13499331c1e0643930e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76f302b4b9c3a13499331c1e0643930e");
            return;
        }
        this.mMach = mach;
        this.data = map;
        this.value = map2;
        this.mRenderTask = new RenderNodeTask(mach, i, i2, aVar, hVar);
        this.mRenderViewTask = new RenderViewTreeTask(mach, aVar, hVar);
    }

    @Override // android.os.AsyncTask
    public com.sankuai.waimai.mach.node.a doInBackground(Void... voidArr) {
        Object[] objArr = {voidArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "866210b7ec7329a96acfdd51047dd507", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "866210b7ec7329a96acfdd51047dd507");
        }
        com.sankuai.waimai.mach.node.a createRenderNode = this.mRenderTask.createRenderNode(this.data, this.value);
        d.a(this.mMach, createRenderNode);
        if (this.mMach.getV8JSEngine() != null && !this.mMach.getMachBundle().e()) {
            this.mMach.getV8JSEngine().a();
        }
        return createRenderNode;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.AsyncTask
    public void onPostExecute(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "590ee8c1ad99c9e42ab82fed3fba61b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "590ee8c1ad99c9e42ab82fed3fba61b5");
            return;
        }
        super.onPostExecute((RendererAsyncTask) aVar);
        this.mRenderViewTask.createView(aVar, this.mMach.getRootNode());
        this.mMach.setRootNode(aVar);
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "106658e317fe9cc97fe16d74a3479969", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "106658e317fe9cc97fe16d74a3479969");
            return;
        }
        super.onCancelled();
        if (this.mRenderTask == null || this.mRenderTask.getIsCancelled() == null) {
            return;
        }
        this.mRenderTask.getIsCancelled().set(true);
    }
}
