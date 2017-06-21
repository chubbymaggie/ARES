# ARES

This repository contains the ARES source code, a description of the ARES rule system and the evaluation results of the research paper 
"G.  Dotzler, M. Kamp, P. Kreutzer, M. Philippsen: More Accurate Recommendations for Method-Level Changes".

## Structure

This repository is structured as follows:
- [doc/rules.md](doc/rules.md): Contains a descripton of the rules from the Edit Script Adjustment step in ARES.
- [doc/examples.md](doc/examples.md): Contains some examples.
- [data/examples](data/examples): Contains the source code to the examples.
- [data/junit_evaluation](data/junit_evaluation): Contains the input description and results of the junit evaluation as JSON files.
  - The dataset contains code snippets from JUnit.
  - JUnit is licensed under the Eclipse Public License v1.0, see [LICENSE.epl](`LICENSE.epl`).
- [data/lase_evaluation](data/lase_evaluation): Contains the input description and results of the LASE dataset as JSON files.
  - The dataset contains code snippets from ECLIPSE JDT Core and ECLIPSE SWT.
  - Eclipse JDT Core is licensed under the Eclipse Public License v1.0, see [LICENSE.epl](`LICENSE.epl`).
  - Eclipse SWT is licensed under the Eclipse Public License v1.0, see [LICENSE.epl](`LICENSE.epl`).
- [src](src): Contains the complete source code of ARES.

## Building and Running ARES

Build ARES:

```
gradle build
```

Run the examples in  [data/examples](data/examples):
```
gradle executeExamples
```

Read evaluation results in  [data/junit_evaluation](data/junit_evaluation) and  [data/lase_evaluation](data/lase_evaluation):
```
gradle readEvaluationResults,
```

Execute the evaluation of the LASE dataset:
```
gradle executeLaseEvaluation -PappArgs="['PATH']" 
```
Depending on your internet connection and device, this can take over an hour to execute. The execution requires a download of the ECLIPSE SWT and ECLIPSE JDT CORE repositories and needs to checkout several hundred revisions.

Execute the evaluation of the JUnit dataset:
```
gradle executeJunitEvaluation -PappArgs="['PATH']" ,
```
Depending on your internet connection and device, this can take over an hour to execute. The execution requires a download from the JUnit repository and needs to checkout several thousand revisions.


## License

- the source code of ARES in [src](`src`) is licensed under the MIT license (see [LICENSE.mit](`LICENSE.mit`)).
- [data](`data`) is licensed under the CC0 license (see [LICENSE.c00](`LICENSE.cc0`)).
  - The code snippets cotained in each data file fall under the license of the respective projects (see above).


