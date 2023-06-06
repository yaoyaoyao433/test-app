package com.meituan.msi.api.component.video;

import com.google.gson.JsonObject;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class VideoParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean autoplay;
    public boolean controls;
    public int direction;
    public boolean loop;
    public boolean muted;
    public String objectFit;
    public String operation;
    public String poster;
    public boolean showCenterPlayBtn;
    public boolean showCurrentPlayTime;
    public boolean showDuration;
    public boolean showFullscreenBtn;
    public boolean showMuteBtn;
    public boolean showPlayBtn;
    @MsiParamChecker(required = true)
    public String src;

    public VideoParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff7ffb604d23e615f04b0fef5a4dec3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff7ffb604d23e615f04b0fef5a4dec3d");
            return;
        }
        this.controls = true;
        this.autoplay = false;
        this.muted = false;
        this.showMuteBtn = false;
        this.showCenterPlayBtn = true;
        this.showPlayBtn = true;
        this.showCurrentPlayTime = true;
        this.showDuration = true;
        this.operation = "";
        this.direction = -1;
    }

    public void updateProperty(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cee79c9e5cef18bb965fec036c446ad2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cee79c9e5cef18bb965fec036c446ad2");
        } else if (jsonObject == null) {
        } else {
            try {
                if (jsonObject.has(RaptorUploaderImpl.SRC)) {
                    this.src = jsonObject.get(RaptorUploaderImpl.SRC).getAsString();
                }
                if (jsonObject.has("controls")) {
                    this.controls = jsonObject.get("controls").getAsBoolean();
                }
                if (jsonObject.has("poster")) {
                    this.poster = jsonObject.get("poster").getAsString();
                }
                if (jsonObject.has("autoplay")) {
                    this.autoplay = jsonObject.get("autoplay").getAsBoolean();
                }
                if (jsonObject.has("muted")) {
                    this.muted = jsonObject.get("muted").getAsBoolean();
                }
                if (jsonObject.has("showMuteBtn")) {
                    this.showMuteBtn = jsonObject.get("showMuteBtn").getAsBoolean();
                }
                if (jsonObject.has("showCenterPlayBtn")) {
                    this.showCenterPlayBtn = jsonObject.get("showCenterPlayBtn").getAsBoolean();
                }
                if (jsonObject.has("loop")) {
                    this.loop = jsonObject.get("loop").getAsBoolean();
                }
                if (jsonObject.has("showPlayBtn")) {
                    this.showPlayBtn = jsonObject.get("showPlayBtn").getAsBoolean();
                }
                if (jsonObject.has("showCurrentPlayTime")) {
                    this.showCurrentPlayTime = jsonObject.get("showCurrentPlayTime").getAsBoolean();
                }
                if (jsonObject.has("showDuration")) {
                    this.showDuration = jsonObject.get("showDuration").getAsBoolean();
                }
                if (jsonObject.has("objectFit")) {
                    this.objectFit = jsonObject.get("objectFit").getAsString();
                }
                if (jsonObject.has("operation")) {
                    this.operation = jsonObject.get("operation").getAsString();
                } else {
                    this.operation = "";
                }
                if (jsonObject.has("direction")) {
                    this.direction = jsonObject.get("direction").getAsInt();
                }
                if (jsonObject.has("showFullScreenBtn")) {
                    this.showFullscreenBtn = jsonObject.get("showFullScreenBtn").getAsBoolean();
                }
            } catch (Throwable unused) {
                com.meituan.msi.log.a.a("VideoParam Error: " + jsonObject.toString());
            }
        }
    }
}
