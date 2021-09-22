import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import io
def plot():
    plt.rcParams["figure.figsize"] = (20,10)
    dfECG = pd.read_csv('AD57.csv', parse_dates=True)
    # Convert time to datetime format
    dfECG['Time (s)'] = pd.to_datetime(dfECG['Time (s)'])
    plt.plot(dfECG['PPG (mV)'])
    plt.xticks(range(len(dfECG['Time (s)'])), dfECG['Time (s)'])
    f = io.BytesIO()
    plt.savefig(f, format="png")
    return f.getvalue()

