package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ImageMessage extends MediaMessage {
    public static final int MAX_IMAGE_SIZE = 31457280;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mLinkId;
    private String mNormalUrl;
    private int mOrientation;
    private int mOriginSize;
    private String mOriginUrl;
    private int mThumbnailHeight;
    private String mThumbnailPath;
    private String mThumbnailUrl;
    private int mThumbnailWidth;
    private String mType;
    private boolean mUploadOrigin;

    public ImageMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bb79f6fe32807321665de31917b8b9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bb79f6fe32807321665de31917b8b9a");
            return;
        }
        this.mThumbnailWidth = 0;
        this.mThumbnailHeight = 0;
        this.mOrientation = 0;
        this.mOriginSize = 0;
        this.mThumbnailPath = "";
        this.mThumbnailUrl = "";
        this.mNormalUrl = "";
        this.mOriginUrl = "";
        this.mType = "";
        this.mUploadOrigin = false;
        this.mLinkId = "";
        setMsgType(4);
    }

    public int getThumbnailWidth() {
        return this.mThumbnailWidth;
    }

    public void setThumbnailWidth(int i) {
        this.mThumbnailWidth = i;
    }

    public int getThumbnailHeight() {
        return this.mThumbnailHeight;
    }

    public void setThumbnailHeight(int i) {
        this.mThumbnailHeight = i;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setOrientation(int i) {
        this.mOrientation = i;
    }

    public int getOriginSize() {
        return this.mOriginSize;
    }

    public void setOriginSize(int i) {
        this.mOriginSize = i;
    }

    public String getThumbnailPath() {
        return this.mThumbnailPath;
    }

    public void setThumbnailPath(String str) {
        this.mThumbnailPath = str;
    }

    public String getThumbnailUrl() {
        return this.mThumbnailUrl;
    }

    public void setThumbnailUrl(String str) {
        this.mThumbnailUrl = str;
    }

    public String getNormalUrl() {
        return this.mNormalUrl;
    }

    public void setNormalUrl(String str) {
        this.mNormalUrl = str;
    }

    public String getOriginUrl() {
        return this.mOriginUrl;
    }

    public void setOriginUrl(String str) {
        this.mOriginUrl = str;
    }

    public String getType() {
        return this.mType;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public boolean isUploadOrigin() {
        return this.mUploadOrigin;
    }

    public void setUploadOrigin(boolean z) {
        this.mUploadOrigin = z;
    }

    public String getLinkId() {
        return this.mLinkId;
    }

    public void setLinkId(String str) {
        this.mLinkId = str;
    }

    @Override // com.sankuai.xm.im.message.bean.MediaMessage, com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d248d8d17ad3bb184f8b4f0880ca8be5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d248d8d17ad3bb184f8b4f0880ca8be5");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof ImageMessage) {
            ImageMessage imageMessage = (ImageMessage) iMMessage;
            imageMessage.mThumbnailWidth = this.mThumbnailWidth;
            imageMessage.mThumbnailHeight = this.mThumbnailHeight;
            imageMessage.mOriginSize = this.mOriginSize;
            imageMessage.mThumbnailPath = this.mThumbnailPath;
            imageMessage.mThumbnailUrl = this.mThumbnailUrl;
            imageMessage.mNormalUrl = this.mNormalUrl;
            imageMessage.mOriginUrl = this.mOriginUrl;
            imageMessage.mType = this.mType;
            imageMessage.mUploadOrigin = this.mUploadOrigin;
            imageMessage.mLinkId = this.mLinkId;
        }
    }

    @Override // com.sankuai.xm.im.message.bean.MediaMessage
    public boolean containsUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adfe1a08f36153e094901e7b3a9fc88b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adfe1a08f36153e094901e7b3a9fc88b")).booleanValue();
        }
        if (ac.a(str)) {
            return false;
        }
        if (ac.a(str, getNormalUrl(), getOriginUrl(), getThumbnailUrl())) {
            return true;
        }
        return super.containsUrl(str);
    }
}
