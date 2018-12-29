pipeline
{
    agent any
    stages
    {
            stage
            {steps('Initiate')
                {step{echo "Testing..."}}
            }
            stage
            {steps('Build')
                {step{echo "Build..."}}
            }
            stage
            {steps('Deploy')
                {step{echo "Deploy..."}}
            }
    }
}