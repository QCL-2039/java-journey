from pytube import YouTube

# Replace this with an open-license YouTube video
url = "https://youtu.be/2ZLl8GAk1X4?si=93JpNb_NDzoBwxKV"  # Sample Creative Commons video

# Create YouTube object
yt = YouTube(url)

# Show video info
print("Title:", yt.title)
print("Views:", yt.views)
print("Author:", yt.author)

# Get the highest-resolution progressive stream (video + audio)
stream = yt.streams.filter(progressive=True, file_extension='mp4').get_highest_resolution()

print(f"Downloading: {stream.resolution} ...")
stream.download(output_path="downloads")  # saves into 'downloads' folder
print("✅ Download complete!")
