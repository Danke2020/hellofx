package org.openjfx;

import java.util.List;

public class ApiResponseModel {

    private List<Resources> resources;
    private String nextCursor;
    private Aggregations aggregations;
    private int time;
    private int totalCount;

    public ApiResponseModel() {
    }

    public List<Resources> getResources() {
        return resources;
    }

    public String getNextCursor() {
        return nextCursor;
    }

    public Aggregations getAggregations() {
        return aggregations;
    }

    public int getTime() {
        return time;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public static class Resources {
        private String accessMode;
        private String status;
        private String secureUrl;
        private String url;
        private ImageAnalysis imageAnalysis;
        private Context context;
        //        private List<Access_control> accessControl;
        private int pixels;
        private double aspectRatio;
        private int height;
        private int width;
        private int backupBytes;
        private int bytes;
        private String uploadedAt;
        private String createdAt;
        private String type;
        private String resourceType;
        private int version;
        private String format;
        private String filename;
        private String folder;
        private String publicId;
        private String assetId;

        public String getAccessMode() {
            return accessMode;
        }

        public String getStatus() {
            return status;
        }

        public String getSecureUrl() {
            return secureUrl;
        }

        public String getUrl() {
            return url;
        }

        public ImageAnalysis getImageAnalysis() {
            return imageAnalysis;
        }

        public Context getContext() {
            return context;
        }

//        public List<Access_control> getAccessControl() {
//            return accessControl;
//        }

        public int getPixels() {
            return pixels;
        }

        public double getAspectRatio() {
            return aspectRatio;
        }

        public int getHeight() {
            return height;
        }

        public int getWidth() {
            return width;
        }

        public int getBackupBytes() {
            return backupBytes;
        }

        public int getBytes() {
            return bytes;
        }

        public String getUploadedAt() {
            return uploadedAt;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public String getType() {
            return type;
        }

        public String getResourceType() {
            return resourceType;
        }

        public int getVersion() {
            return version;
        }

        public String getFormat() {
            return format;
        }

        public String getFilename() {
            return filename;
        }

        public String getFolder() {
            return folder;
        }

        public String getPublicId() {
            return publicId;
        }

        public String getAssetId() {
            return assetId;
        }
    }

    public static class ImageAnalysis {
        private Colors colors;
        private boolean transparent;
        private int illustrationScore;
        private boolean grayscale;
        private List<String> faces;
        private int faceCount;

        public Colors getColors() {
            return colors;
        }

        public boolean getTransparent() {
            return transparent;
        }

        public int getIllustrationScore() {
            return illustrationScore;
        }

        public boolean getGrayscale() {
            return grayscale;
        }

        public List<String> getFaces() {
            return faces;
        }

        public int getFaceCount() {
            return faceCount;
        }
    }

    public static class Colors {
        private double gray;

        public double getGray() {
            return gray;
        }
    }

    public static class Context {
    }

    public static class AccessControl {
        private String end;
        private String start;
        private String accessType;

        public String getEnd() {
            return end;
        }

        public String getStart() {
            return start;
        }

        public String getAccessType() {
            return accessType;
        }
    }

    public static class Aggregations {
        private Format format;

        public Format getFormat() {
            return format;
        }
    }

    public static class Format {
        private int doc;
        private int mp4;
        private int jpg;
        private int png;

        public int getDoc() {
            return doc;
        }

        public int getMp4() {
            return mp4;
        }

        public int getJpg() {
            return jpg;
        }

        public int getPng() {
            return png;
        }
    }
}
