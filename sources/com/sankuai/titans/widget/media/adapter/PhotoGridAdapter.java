package com.sankuai.titans.widget.media.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.widget.BaseKit;
import com.sankuai.titans.widget.media.entity.Photo;
import com.sankuai.titans.widget.media.entity.PhotoDirectory;
import com.sankuai.titans.widget.media.event.OnItemCheckListener;
import com.sankuai.titans.widget.media.event.OnPhotoClickListener;
import com.sankuai.titans.widget.media.utils.AndroidLifecycleUtils;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoDrawableTarget;
import com.squareup.picasso.RequestCreator;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PhotoGridAdapter extends SelectableAdapter<PhotoViewHolder> {
    private static final int COL_NUMBER_DEFAULT = 3;
    public static final int ITEM_TYPE_CAMERA = 100;
    public static final int ITEM_TYPE_PHOTO = 101;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int columnNumber;
    private boolean hasCamera;
    private int imageSize;
    private LayoutInflater inflater;
    private View.OnClickListener onCameraClickListener;
    private OnItemCheckListener onItemCheckListener;
    private OnPhotoClickListener onPhotoClickListener;
    private Picasso picasso;
    private boolean previewEnable;

    public PhotoGridAdapter(Context context, Picasso picasso, List<PhotoDirectory> list) {
        Object[] objArr = {context, picasso, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ea776474bf2c30265e9bf60e857efc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ea776474bf2c30265e9bf60e857efc4");
            return;
        }
        this.onItemCheckListener = null;
        this.onPhotoClickListener = null;
        this.onCameraClickListener = null;
        this.hasCamera = true;
        this.previewEnable = true;
        this.columnNumber = 3;
        this.photoDirectories = list;
        this.picasso = picasso;
        this.inflater = LayoutInflater.from(context);
        setColumnNumber(context, this.columnNumber);
    }

    public PhotoGridAdapter(Context context, Picasso picasso, List<PhotoDirectory> list, ArrayList<String> arrayList, int i) {
        this(context, picasso, list);
        Object[] objArr = {context, picasso, list, arrayList, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa4edf1f241cb1f9c6dca3eb4871697b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa4edf1f241cb1f9c6dca3eb4871697b");
            return;
        }
        setColumnNumber(context, i);
        this.selectedPhotos = new ArrayList();
        if (arrayList != null) {
            this.selectedPhotos.addAll(arrayList);
        }
    }

    private void setColumnNumber(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bda482d88b3c92c0c208f5ea047592df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bda482d88b3c92c0c208f5ea047592df");
            return;
        }
        this.columnNumber = i;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.imageSize = displayMetrics.widthPixels / i;
    }

    public void notifyDataChangedByPage(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0121982429533cce53ecd77f32bf575c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0121982429533cce53ecd77f32bf575c");
        } else {
            notifyItemRangeChanged(i > 0 ? (i * 200) + 1 : 0, 200);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fe45a3f88051db55f2f3544e6fac3ad", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fe45a3f88051db55f2f3544e6fac3ad")).intValue() : (showCamera() && i == 0) ? 100 : 101;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public PhotoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed727a0895a39022e85739f3a7429b42", RobustBitConfig.DEFAULT_VALUE)) {
            return (PhotoViewHolder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed727a0895a39022e85739f3a7429b42");
        }
        PhotoViewHolder photoViewHolder = new PhotoViewHolder(this.inflater.inflate(R.layout.titans_picker_item_photo, viewGroup, false));
        if (i == 100) {
            photoViewHolder.vSelected.setVisibility(8);
            photoViewHolder.ivPhoto.setScaleType(ImageView.ScaleType.CENTER);
            photoViewHolder.ivPhoto.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.widget.media.adapter.PhotoGridAdapter.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "91768a39f7974a0200a1dc30082066d3", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "91768a39f7974a0200a1dc30082066d3");
                    } else if (PhotoGridAdapter.this.onCameraClickListener != null) {
                        PhotoGridAdapter.this.onCameraClickListener.onClick(view);
                    }
                }
            });
        }
        return photoViewHolder;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onBindViewHolder(final PhotoViewHolder photoViewHolder, int i) {
        final Photo photo;
        Object[] objArr = {photoViewHolder, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d67c032451f889a59f31fe5e27f43b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d67c032451f889a59f31fe5e27f43b3");
        } else if (getItemViewType(i) == 101) {
            List<Photo> currentPhotos = getCurrentPhotos();
            if (showCamera()) {
                photo = currentPhotos.get(i - 1);
            } else {
                photo = currentPhotos.get(i);
            }
            if (AndroidLifecycleUtils.canLoadImage(photoViewHolder.ivPhoto.getContext())) {
                String originalPath = photo.getOriginalPath();
                if (!TextUtils.isEmpty(originalPath)) {
                    try {
                        useFileShowImage(originalPath, photoViewHolder.ivPhoto, new PicassoDrawableTarget() { // from class: com.sankuai.titans.widget.media.adapter.PhotoGridAdapter.2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // com.squareup.picasso.PicassoDrawableTarget
                            public void onLoadFailed(Exception exc, Drawable drawable) {
                                Object[] objArr2 = {exc, drawable};
                                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "629c182f7101c2b113340570ec287adc", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "629c182f7101c2b113340570ec287adc");
                                    return;
                                }
                                super.onLoadFailed(exc, drawable);
                                PhotoGridAdapter.this.useUriShowImage(photo.getUri(), photoViewHolder.ivPhoto);
                            }
                        });
                    } catch (Exception unused) {
                    }
                }
                useUriShowImage(photo.getUri(), photoViewHolder.ivPhoto);
            }
            boolean isSelected = isSelected(photo);
            photoViewHolder.vSelected.setSelected(isSelected);
            photoViewHolder.ivPhoto.setSelected(isSelected);
            if (photo.getMediaType() == 2) {
                photoViewHolder.duration.setText(BaseKit.formatTime(photo.getDuration()));
                photoViewHolder.duration.setVisibility(0);
            } else {
                photoViewHolder.duration.setVisibility(8);
            }
            photoViewHolder.ivPhoto.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.widget.media.adapter.PhotoGridAdapter.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d911d6913563a72731e069ded2c5e350", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d911d6913563a72731e069ded2c5e350");
                    } else if (PhotoGridAdapter.this.onPhotoClickListener != null) {
                        int adapterPosition = photoViewHolder.getAdapterPosition();
                        if (PhotoGridAdapter.this.previewEnable) {
                            PhotoGridAdapter.this.onPhotoClickListener.onClick(view, adapterPosition, PhotoGridAdapter.this.showCamera());
                        } else {
                            photoViewHolder.vSelected.performClick();
                        }
                    }
                }
            });
            photoViewHolder.vSelected.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.widget.media.adapter.PhotoGridAdapter.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    boolean z = true;
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "713b21a29b8a35a159614637beee0aeb", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "713b21a29b8a35a159614637beee0aeb");
                        return;
                    }
                    int adapterPosition = photoViewHolder.getAdapterPosition();
                    if (PhotoGridAdapter.this.onItemCheckListener != null) {
                        z = PhotoGridAdapter.this.onItemCheckListener.onItemCheck(adapterPosition, photo, PhotoGridAdapter.this.getSelectedPhotos().size() + (PhotoGridAdapter.this.isSelected(photo) ? -1 : 1));
                    }
                    if (z) {
                        PhotoGridAdapter.this.toggleSelection(photo);
                        PhotoGridAdapter.this.notifyItemChanged(adapterPosition);
                    }
                }
            });
        } else {
            photoViewHolder.ivPhoto.setImageResource(R.drawable.__picker_camera);
        }
    }

    private void useFileShowImage(String str, ImageView imageView, PicassoDrawableTarget picassoDrawableTarget) {
        Object[] objArr = {str, imageView, picassoDrawableTarget};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eca34c6e036abddc061894c1177582eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eca34c6e036abddc061894c1177582eb");
        } else {
            picassoShowImage(this.picasso.d(str), imageView, picassoDrawableTarget);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void useUriShowImage(Uri uri, ImageView imageView) {
        Object[] objArr = {uri, imageView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a410e31161bd4630d43d8a67311150f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a410e31161bd4630d43d8a67311150f");
        } else {
            picassoShowImage(this.picasso.a(uri), imageView, null);
        }
    }

    private void picassoShowImage(RequestCreator requestCreator, ImageView imageView, PicassoDrawableTarget picassoDrawableTarget) {
        Object[] objArr = {requestCreator, imageView, picassoDrawableTarget};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec09763a33793167aafe4c636755c953", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec09763a33793167aafe4c636755c953");
            return;
        }
        RequestCreator a = requestCreator.e().a(this.imageSize, this.imageSize);
        a.f = R.drawable.__picker_ic_photo_black_48dp;
        a.g = R.drawable.__picker_ic_broken_image_black_48dp;
        a.a(imageView, null, -1, picassoDrawableTarget);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "380459761a388c8895049ff8fa8af958", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "380459761a388c8895049ff8fa8af958")).intValue();
        }
        int size = this.photoDirectories.size() != 0 ? getCurrentPhotos().size() : 0;
        return showCamera() ? size + 1 : size;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class PhotoViewHolder extends RecyclerView.s {
        public static ChangeQuickRedirect changeQuickRedirect;
        private TextView duration;
        private ImageView ivPhoto;
        private View vSelected;

        public PhotoViewHolder(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a0c275b9e93c7ceb8154b86ebd38847", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a0c275b9e93c7ceb8154b86ebd38847");
                return;
            }
            this.ivPhoto = (ImageView) view.findViewById(R.id.iv_photo);
            this.vSelected = view.findViewById(R.id.v_selected);
            this.duration = (TextView) view.findViewById(R.id.duration);
        }
    }

    public void setOnItemCheckListener(OnItemCheckListener onItemCheckListener) {
        this.onItemCheckListener = onItemCheckListener;
    }

    public void setOnPhotoClickListener(OnPhotoClickListener onPhotoClickListener) {
        this.onPhotoClickListener = onPhotoClickListener;
    }

    public void setOnCameraClickListener(View.OnClickListener onClickListener) {
        this.onCameraClickListener = onClickListener;
    }

    public ArrayList<String> getSelectedPhotoPaths() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61782ec30d153e94c6a250622b1a2577", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61782ec30d153e94c6a250622b1a2577");
        }
        ArrayList<String> arrayList = new ArrayList<>(getSelectedItemCount());
        for (String str : this.selectedPhotos) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public void setShowCamera(boolean z) {
        this.hasCamera = z;
    }

    public void setPreviewEnable(boolean z) {
        this.previewEnable = z;
    }

    public boolean showCamera() {
        return this.hasCamera && this.currentDirectoryIndex == 0;
    }

    @Override // com.sankuai.titans.widget.media.adapter.SelectableAdapter, com.sankuai.titans.widget.media.event.Selectable
    public boolean isSelected(Photo photo) {
        Object[] objArr = {photo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2eabfa73305bd01622307e299745226", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2eabfa73305bd01622307e299745226")).booleanValue();
        }
        boolean isSelected = super.isSelected(photo);
        if (isSelected || BaseKit.getSDKVersion() < 29 || !getSelectedPhotos().contains(photo.getOriginalPath())) {
            return isSelected;
        }
        this.selectedPhotos.remove(photo.getOriginalPath());
        this.selectedPhotos.add(photo.getPath());
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onViewRecycled(PhotoViewHolder photoViewHolder) {
        Object[] objArr = {photoViewHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04bb5e081066cc04e8980c715fda3ba5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04bb5e081066cc04e8980c715fda3ba5");
            return;
        }
        i.a(photoViewHolder.ivPhoto);
        super.onViewRecycled((PhotoGridAdapter) photoViewHolder);
    }
}
