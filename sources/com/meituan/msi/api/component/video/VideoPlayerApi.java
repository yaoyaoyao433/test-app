package com.meituan.msi.api.component.video;

import android.view.View;
import com.google.gson.JsonObject;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.component.video.bean.VideoMetadata;
import com.meituan.msi.bean.EventType;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.view.MsiNativeViewApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VideoPlayerApi extends MsiNativeViewApi<d, JsonObject> {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "video.binderror")
    public void onError(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "video.bindfullscreenchange")
    public void onFullscreenchange(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "video.bindloadedmetadata", response = VideoMetadata.class)
    public void onLoadedMetadata(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "video.bindpause")
    public void onPause(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d961ddb4c0e8a4b5aa79cbdeb51d790", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d961ddb4c0e8a4b5aa79cbdeb51d790");
        }
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "video.bindplay")
    public void onPlay(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "video.bindtimeupdate")
    public void onTimeUpdate(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "video.bindwaiting")
    public void onWaiting(MsiContext msiContext) {
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ d a(MsiContext msiContext, JsonObject jsonObject, JsonObject jsonObject2) {
        JsonObject jsonObject3 = jsonObject2;
        Object[] objArr = {msiContext, jsonObject, jsonObject3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "082ec6766840fb95a2862b9a4a3c6439", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "082ec6766840fb95a2862b9a4a3c6439");
        }
        d dVar = new d();
        dVar.setIActivityContext(msiContext.getActivityContext());
        VideoParam videoParam = dVar.getVideoParam();
        videoParam.updateProperty(jsonObject3);
        dVar.a(videoParam);
        dVar.a(new c(new com.meituan.msi.dispather.a(msiContext.getEventDispatcher(), jsonObject), false, dVar));
        if (com.meituan.msi.a.i()) {
            PrintStream printStream = System.out;
            printStream.println("MsiVideo MsiVideoView createCoverView " + jsonObject3.toString());
        }
        return dVar;
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ void a(MsiContext msiContext, View view, int i, JsonObject jsonObject, JsonObject jsonObject2) {
        JsonObject jsonObject3 = jsonObject2;
        Object[] objArr = {msiContext, view, Integer.valueOf(i), jsonObject, jsonObject3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "997de7574bdb454f6e3aca1c1baaf331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "997de7574bdb454f6e3aca1c1baaf331");
            return;
        }
        if (view instanceof d) {
            ((d) view).i();
        }
        super.a(msiContext, view, i, jsonObject, jsonObject3);
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ boolean a(MsiContext msiContext, d dVar, int i, int i2, JsonObject jsonObject, JsonObject jsonObject2) {
        d dVar2 = dVar;
        JsonObject jsonObject3 = jsonObject2;
        Object[] objArr = {msiContext, dVar2, Integer.valueOf(i), Integer.valueOf(i2), jsonObject, jsonObject3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b2aa0551ab37a4d1e7956232ca389d7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b2aa0551ab37a4d1e7956232ca389d7")).booleanValue();
        }
        PrintStream printStream = System.out;
        printStream.println("MsiVideo MsiVideoView updateCoverView " + jsonObject3.toString());
        VideoParam videoParam = dVar2.getVideoParam();
        videoParam.updateProperty(jsonObject3);
        dVar2.a(videoParam);
        return true;
    }

    @MsiApiMethod(name = "video", onUiThread = true, request = JsonObject.class)
    public void handleView(JsonObject jsonObject, MsiContext msiContext) {
        Object[] objArr = {jsonObject, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ee3ef82d6a6402a5717492d41a34747", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ee3ef82d6a6402a5717492d41a34747");
            return;
        }
        PrintStream printStream = System.out;
        printStream.println("MsiVideo MsiVideoView handleView " + jsonObject.toString());
        a(msiContext, (MsiContext) jsonObject);
    }
}
