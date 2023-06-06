package com.sankuai.xm.im.message.bean;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class VideoMessage extends MediaMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mDuration;
    private short mHeight;
    private String mScreenshotPath;
    private String mScreenshotUrl;
    private long mTimestamp;
    private short mWidth;

    public VideoMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5708eed443ffd60b77272aa95d03edc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5708eed443ffd60b77272aa95d03edc");
            return;
        }
        this.mScreenshotUrl = "";
        this.mScreenshotPath = "";
        this.mDuration = 0;
        this.mWidth = (short) 0;
        this.mHeight = (short) 0;
        this.mTimestamp = 0L;
        setMsgType(3);
    }

    public String getScreenshotUrl() {
        return this.mScreenshotUrl;
    }

    public void setScreenshotUrl(String str) {
        this.mScreenshotUrl = str;
    }

    public String getScreenshotPath() {
        return this.mScreenshotPath;
    }

    public void setScreenshotPath(String str) {
        this.mScreenshotPath = str;
    }

    public int getDuration() {
        return this.mDuration;
    }

    public void setDuration(int i) {
        this.mDuration = i;
    }

    public short getWidth() {
        return this.mWidth;
    }

    public void setWidth(short s) {
        this.mWidth = s;
    }

    public short getHeight() {
        return this.mHeight;
    }

    public void setHeight(short s) {
        this.mHeight = s;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public void setTimestamp(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d827678b0ba8d53a64def32df060ae9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d827678b0ba8d53a64def32df060ae9d");
        } else {
            this.mTimestamp = j;
        }
    }

    @Override // com.sankuai.xm.im.message.bean.MediaMessage, com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f90b9192faf443fe9b92ce14b5561ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f90b9192faf443fe9b92ce14b5561ea");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof VideoMessage) {
            VideoMessage videoMessage = (VideoMessage) iMMessage;
            videoMessage.mScreenshotUrl = this.mScreenshotUrl;
            videoMessage.mScreenshotPath = this.mScreenshotPath;
            videoMessage.mDuration = this.mDuration;
            videoMessage.mWidth = this.mWidth;
            videoMessage.mHeight = this.mHeight;
            videoMessage.mTimestamp = this.mTimestamp;
        }
    }

    @Override // com.sankuai.xm.im.message.bean.MediaMessage
    public boolean containsUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1365ef6555fef440b982e10786c9621", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1365ef6555fef440b982e10786c9621")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals(getScreenshotUrl())) {
            return true;
        }
        return super.containsUrl(str);
    }
}
