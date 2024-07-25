# Zetic MLange Android Sample App

Deploy to Android Studio
========================

Currently Java Native Interface is provided.

## Prerequisite

1. Model file

    - Model file is provided by ZETIC.ai with URL. You can simply use the model url.

2. Aar Library

    - Zetic MLange : `zeticMLange.aar`

## Android application project structure

``` 

app
└── libs
    └── zeticlibs
        └── zeticMLange.aar


```


## App settings

- build.gradle (Groovy)

``` gradle

android {
    ...
    packagingOptions {
        jniLibs {
            useLegacyPackaging true
        }
    }
}

dependencies {
    implementation files('libs/zeticlibs/zeticMLange.aar')
}

```
- build.gradle.kts (Kotlin DSL)

``` gradle

android {
    ...
    packaging {
        jniLibs {
            useLegacyPackaging = true
        }
    }
}

dependencies {
    implementation(files("libs/zeticlibs/zeticMLange.aar"))
}

```


## Application Implementation


1. Zetic MLange model running (Java)

``` java
// 1. Zetic MLange model running

// (1) Prepare model inputs
ByteBuffer[] inputs = // Prepare your inputs;

// (2) Load Zetic MLange model
ZeticMLangeModel model = new ZeticMLangeModel(this, "MLANGE MODEL KEY");

// (3) Run model and get outputs
model.run(inputs);

// (4) Get output buffers
ByteBuffer[] outputs = model.getOutputBuffers();
```

2. Zetic MLange model running (Kotlin)

``` kotlin
// 1. Zetic MLange Model Running

// (1) Prepare model inputs
val inputs: Array<ByteBuffer> = // Prepare your inputs

// (2) Load Zetic MLange model
val model = ZeticMLangeModel(this, "MODEL KEY")

// (3) Run model and get outputs
model.run(inputs)

// (4) Get output buffers
val outputs = model.outputBuffers
```